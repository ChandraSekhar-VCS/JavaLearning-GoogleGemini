package Generics.BoundedTypeParameters;

import java.util.List;

public class UpperBoundExample {
    public static int sumOfList(List<? extends Number> list){
        int sum = 0;
        for (Number number : list) {
            sum += number.intValue();
        }
        return sum;
    }
}
