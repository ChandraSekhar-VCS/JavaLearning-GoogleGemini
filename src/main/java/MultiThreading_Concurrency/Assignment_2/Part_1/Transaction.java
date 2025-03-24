package MultiThreading_Concurrency.Assignment_2.Part_1;

public class Transaction implements Runnable {
    private BankAccount account;
    private int amount;
    private boolean isDeposit;

    public Transaction(BankAccount account, int amount, boolean isDeposit) {
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run(){
        int amount = this.amount;
        if(isDeposit){
            account.deposit(amount);
            System.out.println(Thread.currentThread().getName() + ": deposited " + amount);
        }
        else{
            int balance = account.getBalance();
            if(balance < amount){
                System.out.println(Thread.currentThread().getName() + ": insufficient funds in account");
            }
            else{
                account.withdraw(amount);
                System.out.println(Thread.currentThread().getName() + ": withdrew " + amount);
            }
        }
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName() + ": interrupted");
        }
    }
}
