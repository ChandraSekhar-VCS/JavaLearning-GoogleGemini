package Java_IO;

import java.io.IOException;
import java.io.StringWriter;

public class WritingToAStream {
    public static void main(String[] args) {
        try(StringWriter writer = new StringWriter()){
            writer.write("Hello World! ");
            writer.write("From Chandra Sekhar");

            String result =  writer.toString();
            System.out.println(result);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
