package Java_IO;

import java.io.*;

public class ReadingLargeFileWithoutBuffer {
    public static void main(String[] args) {
        long timeByFileInputStream;
        long timeByFileReader;
        long timeByBufferedInputStream;
        long timeByBufferedReader;

        // Reading the file using FileInputStream
        try(FileInputStream inputStream = new FileInputStream("Random_text.txt")){
            long startTime = System.currentTimeMillis();
            int byteRead;
            while ((byteRead = inputStream.read()) != -1){
                //we are not printing anything for  now
            }
            long endTime = System.currentTimeMillis();
            timeByFileInputStream = endTime - startTime;
            System.out.println("Time taken by FileInputStream: "+ timeByFileInputStream+" ms ");
        }
        catch (IOException e){
            System.out.println("Error in ReadingLargeFileWithoutBuffer");
        }

        //Reading file using FileReader
        try(FileReader fileReader = new FileReader("Random_text.txt")){
            long startTime = System.currentTimeMillis();
            int character;
            while((character = fileReader.read()) != -1){

            }
            long endTime = System.currentTimeMillis();
            timeByFileReader = endTime - startTime;
            System.out.println("Time taken by FileReader: "+ timeByFileReader+" ms ");
        }
        catch (IOException e){
            System.out.println("Error in ReadingLargeFileWithoutBuffer");
        }


        // Reading using BufferedInputStream
        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("Random_text.txt"))){
            long startTime = System.currentTimeMillis();
            int character;
            while ((character = inputStream.read()) != -1){

            }
            long endTime = System.currentTimeMillis();
            timeByBufferedInputStream = endTime - startTime;
            System.out.println("Time taken by BufferedInputStream: "+ timeByBufferedInputStream+" ms ");
        }
        catch (IOException e){
            System.out.println("Error in ReadingLargeFileWithoutBuffer");
        }

        //Reading using BufferedReader
        try(BufferedReader reader = new BufferedReader(new FileReader("Random_text.txt"))){
            long startTime = System.currentTimeMillis();
            while((reader.readLine() != null)){

            }
            long endTime = System.currentTimeMillis();
            timeByBufferedReader = endTime - startTime;
            System.out.println("Time taken by BufferedReader: "+ timeByBufferedReader+" ms ");
        }
        catch (IOException e){
            System.out.println("Error in ReadingLargeFileWithoutBuffer");
        }
    }
}
