package exceptionhendling;
import java.util.Scanner;
public class throwException {


    public void cal(int a){
        if(a==0){
            throw new ArithmeticException("cant divide by zero");
        } else{
            int ans=100/a;
            System.out.println(ans);
        }



    }




    public static void main(String[] args){
        System.out.println("enter the value of divider");
      Scanner s = new Scanner(System.in);
      int A = s.nextInt();

          throwException te =new throwException();
          try{
              te.cal(A);
          }
          catch (ArithmeticException e){
              System.out.println(e.getMessage());
          }


        System.out.println("code continues");

    }
}
