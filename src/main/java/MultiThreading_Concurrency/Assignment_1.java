package MultiThreading_Concurrency;
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread created by extending Thread class is running....");
        for(int i=1;i<=10;i++){
            System.out.print(i + " ");
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread created by Implementing Runnable is running....");
        for(int i=1;i<=10;i++){
            System.out.print(i + " ");
        }
    }
}

class MyDaemon implements Runnable{
    @Override
    public void run(){
        try{
            while(true){
                System.out.println("Daemon thread is running....");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Daemon thread has been interrupted.");
        }
    }
}
public class Assignment_1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
        MyDaemon myDaemon = new MyDaemon();
        Thread thread3 = new Thread(myDaemon);
        thread3.setDaemon(true);
        thread3.start();
    }
}
