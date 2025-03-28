package Generics.GenericCollections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> numbers  = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

       ListPrinter.printList(numbers);
       Integer element = numbers.get(0);
       int occurences = ListPrinter.countOccurrences(numbers,1);
       System.out.println("occurrences of " +  element + " is " + occurences);
    }
}
