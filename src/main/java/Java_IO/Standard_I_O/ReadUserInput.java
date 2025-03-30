package Java_IO.Standard_I_O;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInput {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Please enter you name: ");
            String name = br.readLine();
            System.out.print("Please enter your age: ");
            Integer age = Integer.valueOf(br.readLine());
            if(age < 18){
                System.err.println("Invalid age - you should get parental apporval");
            }
            System.out.print("Please enter your message: ");
            String message = br.readLine();
            //Task-1 - Print the user's input back to the console
            System.out.println("Name: " + name + " Age: " + age + " Message: " + message);
            //Task-2 - format the output using System.out.printf()
            System.out.printf("Name:%s, Age: %d,Message: %s",name,age,message);

        }
        catch(IOException e){
            System.err.println("Error in reading the user Input");
        }
    }
}
