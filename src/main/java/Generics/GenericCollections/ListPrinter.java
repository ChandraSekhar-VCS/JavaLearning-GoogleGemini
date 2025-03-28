package Generics.GenericCollections;

import java.util.List;

public class ListPrinter {

    public static <T> void printList(List<T> list){
        for( T elemnet : list){
            System.out.println(elemnet);
        }
    }

    public static <T> int countOccurrences(List<T> list, T elemnet){
        int count = 0;
        for( T currentElement : list){
            if(currentElement.equals(elemnet)){
                count++;
            }
        }
        return count;
    }
}
