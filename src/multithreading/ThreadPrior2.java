package multithreading;

class ThreadP2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("child thread");
        }
    }
}

public class ThreadPrior2 {
    public static void main(String[] args){
        ThreadP2 t2=new ThreadP2();
        t2.setPriority(10);
        t2.start();
        for(int i=0;i<5;i++){
            System.out.println("main thread");
        }
    }
}
