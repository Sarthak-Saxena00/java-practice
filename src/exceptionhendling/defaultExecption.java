package exceptionhendling;

public class defaultExecption {
    public void doStuff(){
        doMoreStuff();
    }
    public void doMoreStuff(){
        System.out.println("this is where error will occurs");
       // int a=10/0;
        //System.out.println(a);

    }
    public static void main(String[] args){
        System.out.println("hey this is exception code");
        defaultExecption de = new defaultExecption();
        de.doStuff();
    }
}
