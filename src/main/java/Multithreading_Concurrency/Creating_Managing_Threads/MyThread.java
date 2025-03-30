package Multithreading_Concurrency.Creating_Managing_Threads;

public class MyThread extends  Thread{
    public void run(){
        System.out.println("Thread started: "  + this.getName());
        System.out.println("Thread ID: " + this.getId());
    }
}
