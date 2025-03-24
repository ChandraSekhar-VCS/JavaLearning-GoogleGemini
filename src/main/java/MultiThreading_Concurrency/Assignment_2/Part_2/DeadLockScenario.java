package MultiThreading_Concurrency.Assignment_2.Part_2;

public class DeadLockScenario {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 : Holding  lock1....");
                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread 1 is waiting for lock2....");
                synchronized (lock2) {
                    System.out.println("Thread 1 holding lock1 and lock2....");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 is Holding lock2....");
                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread 2 is Waiting for lock1....");
                synchronized (lock1) {
                    System.out.println("thread 2 is holding lock2 and lock1....");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
