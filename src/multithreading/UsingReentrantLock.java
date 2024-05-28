package multithreading;
import java.util.concurrent.locks.ReentrantLock;

class Counter{
    private final ReentrantLock l=new ReentrantLock();  // made an object of ReentrantLock class
    public int Count =0;

    public void increment(){
        l.lock();
        try{
            for(int i=1;i<=100;i++){
                Count++;
                System.out.println("the value of count"+Count);
            }
        }
        finally {
            l.unlock();
        }
    }

    public void decrement(){
        l.lock();
        try{
            for(int i=1;i<=500;i++){
                Count--;
                System.out.println("the decremented value is "+Count);
            }
        }finally {
            l.unlock();
        }
    }
}






class SyncThread1 extends Thread{
    Counter st_count;                      //made a st_count variable type of Counter class

    public SyncThread1(Counter st_count){
        this.st_count=st_count;
    }                                      // made a constructor and provides it the value

    @Override
    public void run() {
        System.out.println("this is thread 1 and it is being used to increment the Counter ");
        st_count.increment();

    }
}
class SyncThread2 extends Thread{
    Counter st_count;

    public SyncThread2(Counter st_count){
        this.st_count=st_count;
    }
    @Override
    public void run() {
        System.out.println("this is thread 2 and this will decrement the value of count");
        st_count.decrement();
    }
}

public class UsingReentrantLock {
    public static void main(String[] args) {
        Counter counter=new Counter();// made a object of our Counter class and reference variable is counter


        SyncThread1 st=new SyncThread1(counter);// pass our counter because we made a parameterized constructor that will pass the value of "count" to the this.st_count= st_count;
        st.start();
        SyncThread2 st2=new SyncThread2(counter);// same
        st2.start();

//      try {
//           st.join();
//           st2.join();
//         }catch (InterruptedException e){
//                 e.getCause();
//                                        }


        //

    }
}
