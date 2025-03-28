package Generics.BoundedTypeParameters;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        LowerBoundExample.addIntegers(integerList);
        LowerBoundExample.addIntegers(numberList);
        LowerBoundExample.addIntegers(objectList);

        System.out.println(UpperBoundExample.sumOfList(integerList));
        System.out.println(UpperBoundExample.sumOfList(numberList));
    }
}
