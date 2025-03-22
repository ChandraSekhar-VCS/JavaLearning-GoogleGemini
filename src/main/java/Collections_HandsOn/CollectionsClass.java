package Collections_HandsOn;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.min;

public class CollectionsClass {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(25);
        Collections.sort(numbers);
        System.out.println("After Sorting");
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println("After Shuffling");
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println("After Reversing");
        System.out.println(numbers);
        System.out.println( "max is "+Collections.min(numbers));
        System.out.println("min is"+Collections.max(numbers));

    }
}
