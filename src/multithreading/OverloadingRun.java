package multithreading;


class NewOLThread extends Thread{
    public void run(){
        System.out.println(" RUN() method only creates new thread");
    }
    public void run(int a){
        System.out.println("run(int a) is just overloading but not making new thread and the value is -"+a);

    }
//    public void start(){
//        System.out.println("START");
//
//    }
    // if we override start() then we cant be able to create a new thread .


}

public class OverloadingRun {
    public static void main(String[] args){
        System.out.println("main thread");
        NewOLThread OLR=new NewOLThread();
        OLR.start();
        OLR.run(10);
    }
}
