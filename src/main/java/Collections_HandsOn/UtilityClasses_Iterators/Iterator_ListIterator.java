package Collections_HandsOn.UtilityClasses_Iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator_ListIterator {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("cow");
        animals.add("bird");
        Iterator<String> iterator = animals.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ListIterator<String> listIterator = animals.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        animals.listIterator(2).add("fish");
    }
}
