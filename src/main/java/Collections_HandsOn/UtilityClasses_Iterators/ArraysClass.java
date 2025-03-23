package Collections_HandsOn.UtilityClasses_Iterators;

import java.util.Arrays;
import java.util.List;

public class ArraysClass {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "apple";
        names[1] = "banana";
        names[2] = "cherry";
        names[3] = "date";
        System.out.println("Before sorting");
        System.out.println("After sorting");
        Arrays.sort(names);
        System.out.println("Index of banana is :" + Arrays.binarySearch(names,"banana"));
        System.out.println("after filling with fruit");
        Arrays.fill(names,"fruit");
        System.out.println("converting to list");
        List<String> fruits = Arrays.asList(names);
    }
}
