package Multithreading_Concurrency.Creating_Managing_Threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        System.out.println("Main thread id: " + Thread.currentThread().getId());

        MyThread myThread1 = new MyThread();
        myThread1.setName("MyThread-1");
        MyThread myThread2 = new MyThread();
        myThread2.setName("MyThread-2");

        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();
        Thread thread1 = new Thread(myRunnable1,"MyRunnable-1");
        Thread thread2 = new Thread(myRunnable2,"MyRunnable-2");

        MyDaemon myDaemon1 = new MyDaemon();
        Thread  thread3 = new Thread(myDaemon1,"MyDaemon-1");
        thread3.setDaemon(true);
        thread3.start();

        myThread1.start();
        myThread2.start();
        thread1.start();
        thread2.start();
    }
}
