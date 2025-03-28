package Generics.GenericMethod;

public class Test {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        Integer[] reversedArray = reverseArrayGenericMethod.reverse(array);
        for(Integer i : reversedArray){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
