package exceptionhendling;
import java.util.Scanner;
class Nullpoint extends Thread{


    private  String str;// for taking string
    private int CharAt;// for taking char at

    public Nullpoint(String str,int CharAt){
        this.str=str;
        this.CharAt=CharAt;
    }//this is constructor and by this i entered my custom string to private string Str;




    public void run(){
        getString();
        CheckAt();
    }
    public void getString(){
        System.out.println("the string u entered is"+str);

    }
    public void CheckAt(){
        if( CharAt>str.length()){
            throw new StringIndexOutOfBoundsException("u are checking after way out");
        }
            System.out.println("the character at "+CharAt+"is:__"+str.charAt(CharAt));

    }

}



public class NullPointThrow {
    public static void main(String[] args){
        System.out.println("main thread");
        Scanner s=new Scanner(System.in);


        System.out.println("enter the string");
        String st=s.next();


        System.out.println("enter the char position u wanna check");
        int CharAt=s.nextInt();


        Nullpoint np= new Nullpoint(st,CharAt);
        try{
            np.start();
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("code continues ");
    }
}
