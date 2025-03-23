package Collections_HandsOn.GenericsExamples;

import java.util.ArrayList;
import java.util.List;

public class WildcardsBoundedTypesExample {
    public static void printNumbers(List<? extends Number> numbers){
        for(Number number : numbers){
            System.out.println(number);
        }
    }
    public static void addNumbers(List<? super Integer>  numbers){
        numbers.add(40);
        numbers.add(50);
    }
    public static void main(String[] args) {
        List<Integer> integerNumbers = new ArrayList<>();
        List<Double> doubleNumbers = new ArrayList<>();
        integerNumbers.add(1);
        integerNumbers.add(2);
        integerNumbers.add(3);
        doubleNumbers.add(1.0);
        doubleNumbers.add(2.0);
        doubleNumbers.add(3.0);
        printNumbers(integerNumbers);
        printNumbers(doubleNumbers);
        addNumbers(integerNumbers);
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);
        printNumbers(numbers);
    }
}
