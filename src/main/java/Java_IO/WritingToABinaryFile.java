package Java_IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class WritingToABinaryFile {
    public static void main(String[] args) {
        byte[] data = {65,66,67,68,69};
        try(FileOutputStream outputStream = new FileOutputStream("src/main/resources/Output.bin")){
            for(int b:data){
                outputStream.write(b);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
