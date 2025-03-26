package Java_IO;

import java.io.File;

public class CheckingFileProperties {
    public static void main(String[] args) {
        File file = new File("text_data.txt");
        if(file.exists()){
            System.out.println("Here are the details of the file " + file.getName());
            System.out.println("Is this a file: " + file.isFile());
            System.out.println("The length of the file is: " + file.length());
            System.out.println("The last modified time of the file is: " + file.lastModified());
        }
        else{
            System.out.println("File does not exist");
        }
    }
}
