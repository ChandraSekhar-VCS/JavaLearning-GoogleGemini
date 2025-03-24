package MultiThreading_Concurrency.Assignment_2;

public class BankAccount {
    private int balance;
    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
        System.out.println("Current balance is " + balance);
    }
    synchronized void withdraw(int amount) throws IncorrectAmountException {
        try{
            if(balance >= amount){
                balance -= amount;
            }
            else{
                throw new IncorrectAmountException("Incorrect amount");
            }
        }catch (IncorrectAmountException e){
            System.out.println("The amount you are trying to withdraw is more than you current balance");
            System.out.println("Current balance is " + balance + "withdraw an amount less than this");
        }
    }
    public int getBalance() {
        return balance;
    }
}
