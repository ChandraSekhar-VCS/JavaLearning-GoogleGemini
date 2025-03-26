package Java_IO;

import java.io.File;

public class DeletingAFile {
    public static void main(String[] args) {
        File file = new File("new_file.txt");
        if(file.exists()){
            file.delete();
            if(file.exists()){
                System.out.println("Failed to delete File");
            }
            else{
                System.out.println("File " +  file.getName() + " deleted successfully");
            }
        }
        else{
            System.out.println("File does not exist");
        }
    }
}
