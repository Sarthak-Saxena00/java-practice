package encapsulation;
import  java.util.Scanner;
public class main {
    public static void main(String[] args){

    Scanner s=new Scanner(System.in);
        System.out.println("enter the length");
    int len=s.nextInt();

        System.out.println("enter the width");
        int wid=s.nextInt();


        rectangle r = new rectangle();
        r.setLength(len);
        r.getLength();

        r.setWidth(wid);
        r.getWidth();

        r.CalculateArea();


        // BANKACCOUNT;

        BankAccount ba = new BankAccount();
        System.out.println("enter the account number");
        int ACno=s.nextInt();

        System.out.println("enter the amount u want to debit");
        double AMT=s.nextInt();

        ba.setBalance(1000);

        ba.setAccountNumber(ACno);

        ba.getBalance();
        ba.withdraw(AMT);









    }
}
