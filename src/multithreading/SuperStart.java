package multithreading;

class SuperThread extends Thread{
    public void run(){
        System.out.println("creating new thread");
    }

    public void start(){
        System.out.println("this is a start method and i am also calling start() of thread class by super");
        super.start();
    }


}



public class SuperStart {
 public static void main(String[] args){
     System.out.println("main thread");
     SuperThread st=new SuperThread();
     st.start();
     try{
         st.start();

     }catch (IllegalMonitorStateException e){
         e.printStackTrace();
         System.out.println(e.getMessage());
     }
     System.out.println("code continues");
 }
}
