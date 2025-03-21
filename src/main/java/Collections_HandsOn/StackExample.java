package Collections_HandsOn;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.pop();
        stack.pop();
        stack.push('d');
        while(stack.empty() == false){
            char c = stack.pop();
            System.out.println(c);
        }
    }
}
