package util.main.string;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenNotepadAndFile {

	public OpenNotepadAndFile() {
        // Path to the text file
        String filePath = "\\\\gimgcndev01\\c$\\IBM\\WebSphere\\AppServer\\profiles\\ICNNode02\\logs\\ICNNode02\\SystemOut.log";

        //----[Open Notepad]----
        openNotepads();

        //----[Open the text file in Notepad]----
//      openFileInNotepads(filePath);	
    }
	
	
    private static void openNotepads() {
        try {
            // Use ProcessBuilder to open Notepad
        	////ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Notepad++\\notepad++.exe");
            ProcessBuilder pb = new ProcessBuilder("notepad.exe");
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private static void openFileInNotepads(String filePath) {
        try {
            // Create a File object for the specified file path
            File file = new File(filePath);

            // Check if the file exists
            if (file.exists()) {
                // Open the file using the default system application
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("File does not exist: " + filePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
