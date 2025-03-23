package Collections_HandsOn.SetImplementations;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new  HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("cherry");
        fruits.add("Apple");
        System.out.println(fruits);
        System.out.println(fruits.contains("Banana"));
        fruits.remove("Cherry");
        System.out.println(fruits.size());
    }
}
