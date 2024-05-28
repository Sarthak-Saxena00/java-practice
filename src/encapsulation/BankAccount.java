package encapsulation;

public class BankAccount {
    private int AccountNumber;
    private int Balance;

    public int getBalance() {
        System.out.println("the current balance is"+Balance);
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getAccountNumber() {
        System.out.println("the account number is "+AccountNumber);
        return AccountNumber;
    }

    public void withdraw(double Amount){
        double RemainingBalance=Balance-Amount;
        System.out.println("the remaining balance is"+RemainingBalance);

    }




}
