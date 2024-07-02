//Question 1: You have a class BankAccount with a method withdraw(int amount) that subtracts the given amount from the account balance. However, this method is not thread-safe. How would you modify the method to make it thread-safe?
//
//Constraints:
//
//You cannot use synchronized methods or blocks.
//You cannot use AtomicInteger or any other atomic classes.

package multithreading;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankWithdraw {
    public int balance;
    private int BankAccount;
    private final Lock lck=new ReentrantLock();

    public void setBankAccount(int bankAccount) {
        BankAccount = bankAccount;
        System.out.println("the account number is--->"+bankAccount);
    }

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println("the initial current balance is-----> "+balance);
    }

    public void withDraw(int amount){
        lck.lock();
        try{
            if(balance>=amount){
                balance=balance-amount;
            }else {
                System.out.println("cant process enter valid amount");;
            }
        }finally {
            lck.unlock();
        }
    }

    public void getBalance() {
        lck.lock();
        try {
            System.out.println("the remaining balance is---->"+balance);
        }finally {
            lck.unlock();
        }
    }

    public static void main(String[] args) {
        int bankAccount=250964;
        int balance=1000;
        int withdraw=500;
        BankWithdraw bwd=new BankWithdraw();
        bwd.setBankAccount(bankAccount);
        bwd.setBalance(balance);
        bwd.withDraw(withdraw);
        bwd.getBalance();
    }
}
