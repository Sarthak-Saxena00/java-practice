package multithreading;
 class RunnableThread implements Runnable{
     @Override
     public void run() {
         for(int i=0;i<10;i++){
             System.out.println("child thread");
         }
     }
 }
public class ImplimentingRunableClass {
     public static void main(String[] args){
         for(int i=0;i<10;i++){
             System.out.println("main ");
         }
         RunnableThread r=new RunnableThread();
         Thread t=new Thread(r);
         //Thread t2=new Thread(r); creates new object and then execute it
         t.start();
        // t2.start();

     }
}



// if we don't pass r in Thread t=new Thread(); then thread class's run() will be executed and it is empty
// this approach is more recommendable cuz we ever want to extends any other class then we cant


// list, set,
// tree of collection
//