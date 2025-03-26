package Java_IO;

import java.io.*;

public class ReadingABinaryFile {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileInputStream fileInput = new FileInputStream("src/main/resources/binary_data.bin")){
            int byteRead;
            while((byteRead = fileInput.read()) != -1){
                System.out.println(byteRead + " ");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
