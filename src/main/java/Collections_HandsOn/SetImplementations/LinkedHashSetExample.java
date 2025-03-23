package Collections_HandsOn.SetImplementations;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        System.out.println(numbers);
        for(Integer number : numbers){
            System.out.println(number);
        }
    }
}
