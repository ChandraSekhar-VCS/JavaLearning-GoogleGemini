package Generics.WildCards;

import java.util.List;

public class BiundedWildCardsExample {
    public static <T> void copyList(List<? extends T> source, List<? super T> destination){
        for(T element : source){
            destination.add(element);
        }
    }
}
