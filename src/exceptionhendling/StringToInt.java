package exceptionhendling;
import java.util.Scanner;
public class StringToInt {
    public static void main(String[] args){
        System.out.println("enter the string");
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        try{
            int a=Integer.parseInt(str);
            System.out.println("successfully converted");
        }
        catch (NumberFormatException e){
            System.out.println("cant convert string to number");
           // System.out.println(e.toString());
        }

        System.out.println("original string u entered is __"+str);

    }
}
