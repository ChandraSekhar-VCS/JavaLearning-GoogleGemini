package Collections_HandsOn.MapImplementations;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> scores = new Hashtable<>();
        scores.put("Alice",90);
        scores.put("Bob",80);
        scores.put("Charlie",95);
        scores.put("Alice",100);
        System.out.println(scores.get("Bob"));
        System.out.println(scores.containsKey("David"));
        scores.remove("Charlie");
        System.out.println(scores.size());
    }
}
