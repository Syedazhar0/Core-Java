package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFiles {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("D:/rename.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:/copy.txt");

        int i;
        while ((i = fileInputStream.read()) != -1) {
            fileOutputStream.write((char) i);
        }

        // Close the streams
        fileInputStream.close();
        fileOutputStream.close();

        System.out.println("Data copied Successfully");
    }
}
