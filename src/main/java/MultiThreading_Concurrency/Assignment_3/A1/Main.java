package MultiThreading_Concurrency.Assignment_3.A1;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new  Thread(myRunnable,"Thread-1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread t2 = new  Thread(myRunnable,"Thread-2");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        Thread t3 = new  Thread(myRunnable,"Thread-3");
        t3.setPriority(Thread.NORM_PRIORITY);
        t3.start();
        Thread t4 = new  Thread(myRunnable,"Thread-4");
        t4.setPriority(Thread.MIN_PRIORITY);
        t4.start();
        Thread t5 = new  Thread(myRunnable,"Thread-5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t5.start();
    }
}
