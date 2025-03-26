package Java_IO;

import java.io.File;

public class ListingFilesInADirectory {
    public static void main(String[] args) {
        File file = new File(".");
        if (file.isDirectory()) {
            String[] filesArray = file.list();
            if (filesArray != null) {
                System.out.println("Files and Directories in the : " + file.getAbsolutePath() + " are :");
                for(String name : filesArray) {
                    System.out.println(name);
                }
            }
            else{
                System.out.println("Failed to list the files and  directories in the : " + file.getAbsolutePath());
            }
        }
        else{
            System.out.println(file.getAbsolutePath() +  " is not a Directory");
        }
    }
}
