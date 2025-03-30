package Multithreading_Concurrency.Creating_Managing_Threads;

public class MyDaemon implements Runnable {
    @Override
    public void run(){
        try{
            Thread.currentThread().sleep(1);
            System.out.println("Daemon thread is runnin....");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
