package MultiThreading_Concurrency.Assignment_3;

public class ThreadJoiningExample {
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            try{
                System.out.println("Thread A started");
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                System.out.println("Thread A interrupted");
            }
        });

        Thread threadB = new Thread(() -> {
            try{
                System.out.println("Thread B started");
                System.out.println("Thread B finished");
            }
            catch (Exception e) {
                System.out.println("Thread B interrupted");
            }
        });

        Thread threadC = new Thread(() -> {
            try{
                System.out.println("Thread C started");
                System.out.println("Thread C finished");
            } catch (Exception e) {
                System.out.println("Thread C interrupted");
            }
        });

        threadA.start();
        try{
            threadA.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
        try{
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadC.start();
        try{
            threadC.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
