package FileHandling;

import java.io.File;

public class RenameFiles {
    public static void main(String [] args)throws Exception{

        File  file = new File("D:/example.txt");
        File  rename = new File("D:/rename.txt");

        if(file.exists()){
            System.out.println(file.renameTo(rename));
        }else {
            System.out.println("File Does Not Exist");
        }
    }
}
