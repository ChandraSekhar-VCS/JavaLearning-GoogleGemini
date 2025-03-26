package Java_IO;

import java.io.File;
import java.io.IOException;

public class CreatingANewDirectory {
    public static void main(String[] args) {
        File file = new File("new_directory");
        try{
            if(file.mkdir()){
                System.out.println("Directory created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch (Exception e){
            System.out.println("Failed to create directory");
        }
    }
}
