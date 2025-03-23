package Collections_HandsOn.QueueImplementations;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new  PriorityQueue<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        while(!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }

        PriorityQueue<String> names = new PriorityQueue<>(Comparator.comparing(String::length));
        names.add("apple");
        names.add("banana");
        names.add("cherry");
        names.add("date");
        while(!names.isEmpty()){
            System.out.println(names.poll());
        }
    }
}
