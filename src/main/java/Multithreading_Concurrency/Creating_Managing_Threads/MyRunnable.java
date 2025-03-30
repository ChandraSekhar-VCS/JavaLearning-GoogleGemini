package Multithreading_Concurrency.Creating_Managing_Threads;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable thread started: "  + Thread.currentThread().getName());
        System.out.println("Runnable thread ID: " + Thread.currentThread().getId());
    }
}
