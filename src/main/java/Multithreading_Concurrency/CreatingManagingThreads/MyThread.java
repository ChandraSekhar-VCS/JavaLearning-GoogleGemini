package Multithreading_Concurrency.CreatingManagingThreads;

public class MyThread extends  Thread{
    public void run(){
        System.out.println("Thread started: "  + this.getName());
        System.out.println("Thread ID: " + this.getId());
    }
}
