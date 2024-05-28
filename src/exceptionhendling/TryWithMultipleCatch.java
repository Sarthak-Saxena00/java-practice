package exceptionhendling;

public class TryWithMultipleCatch {
    public static void main(String[] args){
        //we can use multiple catch block for multiple different type of exception.
        // if we got arithmetic exception then we must have arithmetic catch block and so on
        // using single catch block with Exception is worst practice .
        String s="sarthak";
        try{
            s.charAt(5);
            System.out.println(10/0);

        }
        catch(StringIndexOutOfBoundsException E){
            System.out.println("the first exception u get"+E.getMessage());
        }
        catch (ArithmeticException e){

            System.out.println("the second exception u got "+e.toString());
        }

        System.out.println("code continues");

    }
}
