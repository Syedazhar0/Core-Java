package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {
        //READING DATA FROM FILE USING BUFFERED READER
//        BufferedReader reader = null; // Declare BufferedReader outside try block
//
//        try {
//            reader = new BufferedReader(new FileReader("D:/example2.txt")); // Initialize BufferedReader
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line); // Print each line
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred: " + e.getMessage());
//        } finally {
//            try {
//                if (reader != null) {
//                    reader.close(); // Close BufferedReader in finally block
//                    System.out.println("File reader closed successfully.");
//                }
//            } catch (IOException e) {
//                System.out.println("Error closing the file reader: " + e.getMessage());
//            }
//        }

        //READING DATA FROM FILE USING BUFFERED READER
        FileReader fileReader = null; // Declare FileReader outside try block
        BufferedReader reader = null; // Declare BufferedReader outside try block

        try {
            fileReader = new FileReader("D:/example2.txt"); // Initialize FileReader
            reader = new BufferedReader(fileReader); // Wrap FileReader in BufferedReader

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
//                if (reader != null) {
//                    reader.close(); // Close BufferedReader in finally block
//                    System.out.println("File reader closed successfully.");
//                }
                if (fileReader != null) {
                    fileReader.close(); // Close FileReader in finally block
                    System.out.println("File reader closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing the file reader: " + e.getMessage());
            }
        }
    }
}
