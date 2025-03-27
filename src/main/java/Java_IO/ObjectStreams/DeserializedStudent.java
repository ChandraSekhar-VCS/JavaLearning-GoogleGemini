package Java_IO.ObjectStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedStudent {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.ser"))){
            Student student = (Student) ois.readObject();
            System.out.println("Student has been Deserialized successfully");
            System.out.println("EmployeeID is: " + student.getEmployeeId());
            System.out.println("Name is: " + student.getName());
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println("Student deserialization failed or Class not found");
        }
    }
}
