package multithreading;
import java.util.concurrent.atomic.AtomicInteger;


 class AtomCount{
    public AtomicInteger  counter=new AtomicInteger(0);

    public  void increment1(){
        for(int i=1;i<=10;i++){
            counter.incrementAndGet();
            System.out.println("by thread 1:-->"+counter);
        }

    }
    public void increment2(){
        for(int i=1;i<=10;i++){
            counter.incrementAndGet();
            System.out.println("by thread 2:->"+counter);
        }
    }
}


//class MyThread2 extends Thread{
//    @Override
//    public void run() {
//        AtomCount.increment2();
//        }
//    }
//}

class MyThread1 extends Thread {
     AtomCount A_count;

    public MyThread1(AtomCount A_count) {
        this.A_count = A_count;
    }

    @Override
    public void run() {
        A_count.increment1();
    }
}

class MyThread2 extends Thread {
     AtomCount A_Count2;

    public MyThread2(AtomCount A_Count2) {
        this.A_Count2 = A_Count2;
    }

    @Override
    public void run() {
        A_Count2.increment2();
        //System.out.println("hey this is thread2");
    }
}



public class AtomicCount {
    public static void main(String[] args) throws InterruptedException {
        AtomCount atomC = new AtomCount();
        MyThread1 mt1 = new MyThread1(atomC);
        MyThread2 mt2 = new MyThread2(atomC);

        mt1.start();
        mt2.start();

//        try {
//            mt1.join();
//            mt2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


          mt1.join();
          mt2.join();

        System.out.println("the counts final value is" + atomC.counter.get() );


    }
}
