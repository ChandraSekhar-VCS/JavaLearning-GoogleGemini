package MultiThreading_Concurrency.Assignment_2.Part_1;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread t1 = new Thread(new Transaction(bankAccount,500,true));
        t1.start();
        Thread t2 = new Thread(new Transaction(bankAccount,500,false));
        t2.start();
        Thread t3 = new Thread(new Transaction(bankAccount,10000,false));
        t3.start();
        Thread t4 = new Thread(new  Transaction(bankAccount,10000,true));
        t4.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }
        catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName() + ": interrupted");
        }
        System.out.println("Final balance is  " + bankAccount.getBalance());
    }
}
