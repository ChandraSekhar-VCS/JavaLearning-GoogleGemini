package Collections_HandsOn.MapImplementations;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Alice",90);
        scores.put("Bob",80);
        scores.put("Charlie",95);
        scores.put("Alice",100);
        System.out.println(scores);

        TreeMap<String, Integer> scores2 = new TreeMap<>(Comparator.reverseOrder());
        scores.put("Alice",90);
        scores.put("Bob",80);
        scores.put("Charlie",95);
        scores.put("Alice",100);
        System.out.println(scores2);
    }
}
