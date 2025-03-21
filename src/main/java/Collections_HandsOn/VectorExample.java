package Collections_HandsOn;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<Double>();
        vector.add(1.1);
        vector.add(2.2);
        vector.add(3.3);
        vector.removeLast();
        int size = vector.size();
        for(int i=0;i<size;i++){
            System.out.println(vector.get(i));
        }
    }
}
