package Java_IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class AppendingToABinaryFile {
    public static void main(String[] args) {
        byte[] data = {97,98,99,100,101};
        try(FileOutputStream outputStream = new FileOutputStream("src/main/resources/Output.bin",true)){
            int byteRead;
            for(byte b:data){
                outputStream.write(b);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
