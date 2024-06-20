package FileHandling;

import java.io.File;
import java.io.IOException;
public class CreateFiles {
    public static void main(String [] args){

        // Specify the directory path
        String directoryPath = "D:/"; // Assuming "d" is a drive letter

        // Specify the file name
        String fileName = "example.txt";

        //        File file = new File("D:/example.txt");
        // Create a File object with the directory path and file name
        File file = new File(directoryPath + fileName);

        try {
            // Create the file
            if (file.createNewFile()) {// method to create file
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
