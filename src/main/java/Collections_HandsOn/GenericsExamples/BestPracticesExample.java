package Collections_HandsOn.GenericsExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class BestPracticesExample {

    public static <T> void printCollection(Collection<T> collection) {
        for (T element : collection) {
            System.out.println(element);
        }
    }

    static class Box<T> {
        private T content;

        public void setContent(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }
    }

    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("cherry");
        printCollection(stringSet);

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(100);

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello");

        System.out.println(integerBox.getContent());
        System.out.println(stringBox.getContent());
    }
}