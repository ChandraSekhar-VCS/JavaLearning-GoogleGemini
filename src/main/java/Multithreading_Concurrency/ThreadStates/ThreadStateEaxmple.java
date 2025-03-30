package Multithreading_Concurrency.ThreadStates;

class ThreadStateExample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(() -> {
            try {
                Thread.sleep(5000); // TIMED_WAITING
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Thread state (before start): " + myThread.getState()); // NEW

        myThread.start();

        System.out.println("Thread state (after start): " + myThread.getState()); // RUNNABLE

        Thread.sleep(100);

        System.out.println("Thread state (during sleep): " + myThread.getState()); // TIMED_WAITING

        myThread.join();

        System.out.println("Thread state (after join): " + myThread.getState()); // TERMINATED
    }
}
