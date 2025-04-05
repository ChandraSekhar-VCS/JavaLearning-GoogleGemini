package Multithreading_Concurrency.RaceCondtitionExample;

public class Counter {
    int count;
    public void increment(){
        count++;
    }
    public void decrement(){
        count--;
    }
    public int getCount(){
        return count;
    }
}
