package Collections_HandsOn;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> scores = new LinkedHashMap<>();
        scores.put("Alice",90);
        scores.put("Bob",80);
        scores.put("Charlie",95);
        scores.put("Alice",100);
        System.out.println(scores);
        for(String name : scores.keySet()){
            System.out.println(name + " : " + scores.get(name));
        }
    }
}
