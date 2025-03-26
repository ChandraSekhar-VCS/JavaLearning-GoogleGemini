package MultiThreading_Concurrency.Assignment_3;

public class DaemonThreadMonitoring {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(()->{
            try{
                while(true){
                    System.out.println("Daemon Thread : " + System.currentTimeMillis());
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println("Daemon Thread interrupted");
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        Thread userThread1 = new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("User Thread 1: " + i);
            }
        });
        Thread userThread2 = new Thread(()->{
            for(char c = 'a';c<='z';c++){
                System.out.println("User Thread 2: " + c);
            }
        });
        Thread userThread3 = new Thread(()->{
            for(char c = 'A';c<='Z';c++){
                System.out.println("User thread 3:" + c);
            }
        });

        userThread1.start();
        userThread2.start();
        userThread3.start();

        try{
            userThread1.join();
            userThread2.join();
            userThread3.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("User threads have finished. Exiting Main Thread");

    }
}
