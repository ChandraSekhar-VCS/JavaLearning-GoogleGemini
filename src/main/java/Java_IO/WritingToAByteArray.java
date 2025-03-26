package Java_IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class WritingToAByteArray {
    public static void main(String[] args) {
        try(ByteArrayOutputStream outputStream = new ByteArrayOutputStream()){
            outputStream.write(65);
            outputStream.write(66);
            outputStream.write(67);
            outputStream.write(68);

            byte[] byteArray = outputStream.toByteArray();
            for(byte b : byteArray){
                System.out.print((char) b + " ");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
