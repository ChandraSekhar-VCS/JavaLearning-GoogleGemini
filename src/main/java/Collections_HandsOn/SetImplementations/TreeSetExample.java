package Collections_HandsOn.SetImplementations;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Zebra");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits);
        TreeSet<String> names = new TreeSet<>(Comparator.reverseOrder());
        names.add("Zebra");
        names.add("Apple");
        names.add("Banana");
        names.add("Cherry");
        System.out.println(names);
    }
}

