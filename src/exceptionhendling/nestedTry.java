package exceptionhendling;

public class nestedTry {
    public static void main(String[] args){
        String s="sarthak";
        try{

            try{
                System.out.println(10/0);
            }
            catch (ArithmeticException e){

                System.out.println("the first exception u got "+e.toString());
            }
            s.charAt(9);
        }
        catch(StringIndexOutOfBoundsException E){
            System.out.println("the second exception u get"+E.getMessage());
        }
    }
}
