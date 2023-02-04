package com.jaron.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyPasteFolder {

	public CopyPasteFolder() {

		File sourceFolder = new File("C:\\output\\folder1\\");
		File destinationFolder = new File("C:\\output\\folder3\\");

		if (!destinationFolder.exists()) {
			destinationFolder.mkdir();
		}

		copyFolder(sourceFolder, destinationFolder);
	}///CopyPasteFolder

	
	public static void copyFolder(File source, File destination) {
		if (source.isDirectory()) {
			if (!destination.exists()) {
				destination.mkdir();
			}

			String files[] = source.list();

			for (String file : files) {
				File srcFile = new File(source, file);
				File destFile = new File(destination, file);

				copyFolder(srcFile, destFile);
			}
		} else {
			try (InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream(destination)) {
				byte[] buffer = new byte[1024];
				int length;
				while ((length = in.read(buffer)) > 0) {
					out.write(buffer, 0, length);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} ///copyFolder

} ///class
