package multithreading;
 class priorThread extends Thread{
     @Override
     public void run() {
         System.out.println("child thread");

     }
 }class priorThread2 extends Thread{
     @Override
     public void run() {
         System.out.println("child thread2");

     }
 }
public class threadPriority {
public static void main(String[] args){
    priorThread pt=new priorThread();
    pt.setName("sarthak's thread");
    pt.start();
    pt.setPriority(2);

    priorThread2 pt2=new priorThread2();
    pt2.start();
    pt2.setPriority(1);

     Thread.currentThread().setPriority(7);
    System.out.println("the main thread priority is "+Thread.currentThread().getPriority());
    String thrd= Thread.currentThread().getName();
    System.out.println(thrd);
}
 }


 // thread scheduler will use priorities
