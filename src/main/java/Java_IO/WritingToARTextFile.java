package Java_IO;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToARTextFile {
    public static void main(String[] args) {

        String text = "Hello World this is Chandra Sekhar, I am soon going to be successful";

        try(FileWriter writer = new FileWriter("src/main/resources/output.txt")){
            writer.write(text);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
