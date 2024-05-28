package multithreading;

class ThreadException extends Thread {
    public void run() {
        System.out.println("creating new thread");
    }
}
public class ThreadingExecption {
   public static void main(String[] args){
       System.out.println("main thread");
       ThreadException te=new ThreadException();
       te.start();
       try{
           te.start();
       }
       catch(IllegalThreadStateException e){
           System.out.println("nahi ban raha new thread");
       }
       System.out.println("code continues");
   }
}

