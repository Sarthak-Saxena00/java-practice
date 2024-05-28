package multithreading;

class NewThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("new thread");
        }
    }
}
class NewThread2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("new thread2");
        }
    }
}


public class MultiThreading1 {
    public static void main(String[] args){

        for(int i=0;i<10;i++){
            System.out.println("main thread");
        }
        NewThread nt=new NewThread();
        nt.start();
        NewThread2 nt2=new NewThread2();
        nt2.start();

    }
}
