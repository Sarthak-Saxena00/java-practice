package multithreading;

import java.util.ArrayList;
import java.util.List;

public class IncrementCount {
    private int count=1;
    private final Object lk=new Object();

    public void printOdd(){
        synchronized (lk){
            while (count<=10){
                if(count%2!=0) {
                    System.out.println(count + "<-------by thread 1");
                    count++;
                }
                else {
                    try{
                        lk.wait();
                    }
                    catch (InterruptedException e){
                        e.getStackTrace();
                    }
                }
                lk.notify();
            }
        }
    }public void printEven(){
        synchronized (lk){
            while (count<=10){
                if(count%2==0) {
                    System.out.println(count + "<--------by thread 2");
                    count++;
                }
                else {
                    try{
                        lk.wait();
                    }
                    catch (InterruptedException e){
                        e.getStackTrace();
                    }
                }
                lk.notify();
            }
        }
    }

    public static void main(String[] args) {
        IncrementCount ic=new IncrementCount();
        Thread t1=new Thread(ic::printOdd);
        Thread t2=new Thread(ic::printEven);
        t1.start();
        t2.start();
        ArrayList<Integer> l= new ArrayList<>();
    }
}
