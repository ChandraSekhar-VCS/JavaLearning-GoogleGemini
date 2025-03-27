package Java_IO.ObjectStreams;

import java.io.*;

public class SerializedStudent {
    public static void main(String[] args) {
        Student seralizedStudent = new Student("WIPRO20382867","Chandra Sekhar",24242);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.ser"))){
            oos.writeObject(seralizedStudent);
            System.out.println("Student has been Serialized successfully");
        }
        catch (IOException e){
            System.out.println("Error in serializing the object");
        }
    }
}
