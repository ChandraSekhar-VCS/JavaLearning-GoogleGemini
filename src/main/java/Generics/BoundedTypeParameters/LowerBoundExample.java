package Generics.BoundedTypeParameters;

import java.util.List;

public class LowerBoundExample {
    public static void addIntegers(List< ? super Integer> list){
        for(int i =1;i <=5;i++){
            list.add(i);
        }
    }
}
