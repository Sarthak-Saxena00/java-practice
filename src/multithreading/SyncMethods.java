package multithreading;
import java.util.Scanner;



class Opration {
    int count;

    public synchronized void addNum(){
        count++;
        System.out.println("add methods values is:_ "+ count);
        }

   public synchronized void subtract(){
        count=count-2;
       System.out.println("after subtracts"+ count);
    }


}

class MyAdd extends Thread{
    private Opration op;

    public MyAdd(Opration op){
        this.op=op;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            op.addNum();
        }
    }
}class MySub extends Thread{
    private Opration op;



    public MySub(Opration op){
        this.op=op;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            op.subtract();
        }
    }
}


public class SyncMethods {
    public static void main(String[] args) throws InterruptedException{

        Opration o=new Opration();
        MyAdd ma=new MyAdd(o);
        MySub ms=new MySub(o);

        ma.start();
        ms.start();
ma.join();
ms.join();
    }
}
