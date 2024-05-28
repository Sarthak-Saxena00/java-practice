package multithreading;
class NameThread extends Thread{
public void run(){
    //System.out.println(10/0);
}
}
public class RenamingThread {
    public static void main(String[] args){
        System.out.println("hey00");
        String s= Thread.currentThread().getName();
        System.out.println(s);
        NameThread ne=new NameThread();
        ne.start();
        ne.setName("sarthak thread");
        System.out.println(ne.getName());
    }
}
