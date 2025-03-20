package Day1;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the String: ");
        String str = sc.nextLine();
        int N = str.length();
        int start = 0;
        int end = N-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                System.out.println("The string is not palindrome");
                break;
            }
            start++;
            end--;
        }
        System.out.println("The string is palindrome");
    }

}
