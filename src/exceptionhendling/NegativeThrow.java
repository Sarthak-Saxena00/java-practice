package exceptionhendling;
import java.util.Scanner;



public class NegativeThrow {
 public void TakeInt(int a){
     if(a<0){
         throw new IllegalArgumentException("this is an negative number exception pls enter +ve number ");
     }


 }
public static void main(String[] args){
     Scanner s= new Scanner(System.in);
    System.out.println("enter the number");
     int Num=s.nextInt();

     NegativeThrow ne=new NegativeThrow();
     try{
         ne.TakeInt(Num);
     } catch(IllegalArgumentException e)
     {
         System.out.println(e.getMessage());
     }

    System.out.println("code continues");
}


}
