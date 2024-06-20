package FileHandling;

import java.io.File;

public class DisplayFileLocationAndMore {

    public static void main(String[] args) {
        File file = new File("D:/example.txt");

        try {
            if (file.exists()) {
                System.out.println("File Name: " + file.getName());
                System.out.println("File Location: " + file.getAbsolutePath());
                System.out.println("Can We Write Something in File: " + file.canWrite());
                System.out.println("Can We Read The File: " + file.canRead());
                System.out.println("File Size: " + file.length() + " bytes");
                System.out.println("File Removed: " + file.delete());
            } else {
                System.out.println("File does not exist.");
            }
        } catch (SecurityException e) {
            System.out.println("Security Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
