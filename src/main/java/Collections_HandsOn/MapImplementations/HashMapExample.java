package Collections_HandsOn.MapImplementations;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Alice",90);
        scores.put("Bob",80);
        scores.put("Charlie",95);
        scores.put("Alice",100);
        System.out.println(scores);
        System.out.println(scores.get("Bob"));
        System.out.println(scores.containsKey("David"));
        scores.remove("Charlie");
        System.out.println(scores.size());

    }
}
