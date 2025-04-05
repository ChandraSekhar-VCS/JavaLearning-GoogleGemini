package Multithreading_Concurrency.RaceCondtitionExample;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = ()->{
          for(int i=0;i<1000;i++){
              if(i%2==0){
                  counter.increment();
              }
              else{
                  counter.decrement();
              }
          }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The final value of count is: "+counter.getCount());
    }
}
