package MultiThreading_Concurrency.Assignment_3.A2;

public class ThreadInterruptionExample {
    public static void main(String[] args) {
        Thread longTask = new Thread(() -> {
            try{
                for(long i=0;i<Long.MAX_VALUE;i++){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Thread is  interrupted....exiting");
                        return;
                    }
                    if(i%100000000 ==0 ){
                        System.out.println("Thread is running " + i);
                        Thread.sleep(1);
                    }
                }
            }
            catch(InterruptedException e){
                System.out.println("Thread is interrupted during sleep.....exiting");
                return;
            }
        });

        longTask.start();

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        longTask.interrupt();
    }
}
