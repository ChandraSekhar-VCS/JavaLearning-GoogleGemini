package Generics.GenericMethod;

public class reverseArrayGenericMethod {
    public static <T> T[] reverse(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        else{
            int start = 0;
            int end = array.length - 1;
            while (start < end) {
                T temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
        return array;
    }
}
