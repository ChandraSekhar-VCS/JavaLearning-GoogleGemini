package Java_IO;

import java.io.FileWriter;
import java.io.IOException;

public class AppendingToATextFile {
    public static void main(String[] args) {
        String text = "Hello World! this is CHANDRA SEKHAR Currently learning Backend-Java,Spring/Spring Boot, I will soon be good at it and secure a job";
        try(FileWriter writer = new FileWriter("src/main/resources/output.txt",true)){
           writer.write(text);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
