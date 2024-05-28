package exceptionhendling;
import java.util.Scanner;
public class TryCatch1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of divider");
        int b= s.nextInt();
        System.out.println("normal code before try" );
        try{
            int a=10/b;
            System.out.println(a);
            System.out.println("flow control checking :- it will not execute if there is exception above it in try block ");

        }

        catch(Exception e){
            System.out.println("can't divided by zero");
        }

        finally {
            System.out.println("this is a finally block");
        }
        System.out.println("normal code 3");
    }
}

// by using try catch we can provide a graceful termination.
// we can use multiple try catch blocks.
// if corresponding catch block isnt available then it will also terminate the program abnormally.
// if there is exception in catch block then it is also an abnormal termination , we can use try and catch into catch block.



//