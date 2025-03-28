package Generics.CreatingGenericClass;

public class Test {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Chandra sekhar");
        String name = stringBox.getItem();
        System.out.println(name);

        Box<Integer> integerBox = new Box<>(20382867);
        int number = integerBox.getItem();
        System.out.println(number);
    }
}
