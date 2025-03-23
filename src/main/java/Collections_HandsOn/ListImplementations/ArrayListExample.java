package Collections_HandsOn.ListImplementations;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        for(int i=1;i<=10;i++){
            numbersList.add(i);
        }
        System.out.println(numbersList.get(3));
        numbersList.remove(5);
        for(int number :numbersList){
            System.out.println(number);
        }
    }
}
