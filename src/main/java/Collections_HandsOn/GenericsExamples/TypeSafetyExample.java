package Collections_HandsOn.GenericsExamples;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        //numbers.add(string);//error
        for(Integer number : numbers){
            System.out.println(number);
        }
    }
}
