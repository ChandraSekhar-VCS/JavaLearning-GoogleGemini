package Generics.GenericInterfaces;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(30);
        Person person2 = new Person(40);

        int result = person1.compareTo(person2);
        if(result == 0){
            System.out.println("Both are of same age");
        } else if (result == 1){
            System.out.println("Person1 is older");
        }
        else{
            System.out.println("Person2 is older");
        }
    }
}
