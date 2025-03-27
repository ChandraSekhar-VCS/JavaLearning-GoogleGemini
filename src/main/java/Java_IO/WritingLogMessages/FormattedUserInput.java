package Java_IO.WritingLogMessages;


import java.io.PrintWriter;
import java.util.Scanner;

public class FormattedUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        System.out.print("Please Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Please Enter your Age: ");
        int age = sc.nextInt();
        System.out.print("Please Enter your Salary: ");
        double salary = sc.nextDouble();
        pw.printf("Name: %s, Age: %d, Salary: %f", name,age,salary);
        pw.close();

    }
}
