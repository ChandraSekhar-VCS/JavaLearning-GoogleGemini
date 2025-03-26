package Java_IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ReadingFromAByteArray {
    public static void main(String[] args) {
        byte[] data = {65,66,67,68};
        try(ByteArrayInputStream inputStream = new ByteArrayInputStream(data)){
            int byteRead;
            while((byteRead = inputStream.read()) != -1){
                System.out.print((char)byteRead + " ");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
