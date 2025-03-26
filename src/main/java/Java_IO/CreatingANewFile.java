package Java_IO;

import java.io.File;
import java.io.IOException;

public class CreatingANewFile {
    public static void main(String[] args) {
        File file = new File("new_file.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch (IOException e){
            System.out.println("Failed to create a new file");
        }
    }
}
