package Java_IO;

import java.io.IOException;
import java.io.StringReader;

public class ReadingFromAString {
    public static void main(String[] args) {
        String text = "Chandra Sekhar";
        try(StringReader reader = new StringReader(text)){
            int charRead;
            while((charRead=reader.read()) != -1){
                System.out.print((char)charRead);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
