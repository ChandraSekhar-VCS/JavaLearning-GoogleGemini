package Generics.GenericClass;

import java.awt.event.ContainerAdapter;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String>  list = new ArrayList<>();
        Container<String> names = new Container<>(list);
        names.addItem("Chandra");
        names.addItem("Sekhar");
        names.addItem("Vipparla");
        System.out.println(names.getItem(0));
        System.out.println(names.getSize());

        Container<Integer> numbers = new Container<>(new ArrayList<>());
        numbers.addItem(1);
        numbers.addItem(2);
        numbers.addItem(3);
        numbers.addItem(4);
        numbers.addItem(5);
        System.out.println(numbers.getItem(0));
        System.out.println(numbers.getSize());
    }
}
