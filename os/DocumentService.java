/***
* DocumentService --> navigator java create service that get all document infromation from folder
**/


import java.io.File;
import java.util.Date;

public class DocumentService {

    public DocumentService() {
        String folderPath = "c:\\installs\\"; // Replace with the actual folder path

        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            processFolderContents(folder);
        } else {
            System.out.println("Folder not found or is not a directory.");
        }
    }

    private static void processFolderContents(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // Process document information here (e.g., get name, size, last modified date, etc.)
                    System.out.println("File name: " + file.getName());
                    System.out.println("File size: " + file.length() + " bytes");
                    System.out.println("Last modified: " + new Date(file.lastModified()));
                    System.out.println("--------------");
                } else if (file.isDirectory()) {
                    // If the file is a subdirectory, recursively process its contents
                    processFolderContents(file);
                }
            }
        }
    }
}
