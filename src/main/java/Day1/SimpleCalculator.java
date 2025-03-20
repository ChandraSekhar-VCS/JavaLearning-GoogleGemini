package Day1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Enter your choice : ");
        byte choice = sc.nextByte();
        switch (choice) {
            case 1:
                System.out.print("Enter the first number : ");
                int num1 = sc.nextInt();
                System.out.print("Enter the second number : ");
                int num2 = sc.nextInt();
                System.out.println("The sum is: "  + (num1+num2));
                break;
            case 2:
                System.out.print("Enter the first number : ");
                int a = sc.nextInt();
                System.out.print("Enter the second number : ");
                int b = sc.nextInt();
                System.out.println("The difference is: "  + (a-b));
                break;
            case 3:
                System.out.print("Enter the first number : ");
                int c = sc.nextInt();
                System.out.print("Enter the second number : ");
                int d = sc.nextInt();
                System.out.println("The product is: "  + (c*d));
                break;
            case 4:
                System.out.print("Enter the first number : ");
                int e = sc.nextInt();
                System.out.print("Enter the second number : ");
                int f = sc.nextInt();
                System.out.println("The result of division is: "  + (e+f));
                break;
        }
    }
}
