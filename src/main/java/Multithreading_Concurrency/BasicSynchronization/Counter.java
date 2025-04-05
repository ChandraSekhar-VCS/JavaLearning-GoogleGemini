package Multithreading_Concurrency.BasicSynchronization;

public class Counter {
    int count = 0;
    public synchronized void increment() {
        count++;
    }
    public synchronized void decrement() {
        count--;
    }
}
