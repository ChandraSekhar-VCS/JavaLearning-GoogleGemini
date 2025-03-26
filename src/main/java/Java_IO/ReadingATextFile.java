package Java_IO;

import java.io.FileReader;
import java.io.IOException;

public class ReadingATextFile {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("src/main/resources/text_data.txt")){
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char)character);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
