package Day1;

import java.util.Scanner;

class FibonacciSequence {

    public static void printFibonacciSequence(int nTerms) {
        if (nTerms <= 0) {
            return; // Nothing to print for non-positive terms
        }

        int[] fibSequence = new int[nTerms];
        int a = 0, b = 1;

        for (int i = 0; i < nTerms; i++) {
            fibSequence[i] = a;
            int next = a + b;
            a = b;
            b = next;
        }

        // Print the sequence
        for (int i = 0; i < nTerms; i++) {
            System.out.print(fibSequence[i] + " ");
        }
        System.out.println(); // Add a newline at the end
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int numTerms = sc.nextInt();
        printFibonacciSequence(numTerms);
    }
}