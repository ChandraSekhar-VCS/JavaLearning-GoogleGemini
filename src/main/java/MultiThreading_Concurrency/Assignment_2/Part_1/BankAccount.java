package MultiThreading_Concurrency.Assignment_2.Part_1;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }
    public synchronized void deposit(int amount) {
        balance += amount;
    }
    public synchronized void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds for Withdrawal");
        }
    }
    public synchronized int getBalance() {
        return balance;
    }
}
