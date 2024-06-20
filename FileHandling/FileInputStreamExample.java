package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            // Open the file
            inputStream = new FileInputStream("D:/example.txt");

            // Read bytes from the file
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                // Process each byte (here we are just printing it)
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            // Handle any I/O exceptions
            e.printStackTrace();
        } finally {
            try {
                // Close the stream in the finally block
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                // Handle any exceptions that occur during closing
                e.printStackTrace();
            }
        }
    }
}
