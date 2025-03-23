package Collections_HandsOn.QueueImplementations;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> fruits = new ArrayDeque<>();
        fruits.offer("apple");
        fruits.offer("banana");
        fruits.offer("cherry");
        fruits.offerFirst("date");
        while(!fruits.isEmpty()){
            System.out.println(fruits.poll());
        }
        ArrayDeque<Character> letters = new ArrayDeque<>();
        letters.push('a');
        letters.push('b');
        letters.push('c');
        while(!letters.isEmpty()){
            System.out.println(letters.pop());
        }

    }
}
