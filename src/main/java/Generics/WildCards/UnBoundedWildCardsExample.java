package Generics.WildCards;

import java.util.List;

public class UnBoundedWildCardsExample {
    public static <T> int countOccurences(List<?> list, Object element){
        int count = 0;
            for(Object listElement : list){
                if(listElement.equals(element)){
                    count++;
                }
            }
        return count;
    }
}
