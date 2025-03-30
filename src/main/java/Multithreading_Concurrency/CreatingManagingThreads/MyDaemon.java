package Multithreading_Concurrency.CreatingManagingThreads;

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
