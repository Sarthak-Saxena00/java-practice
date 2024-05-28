package collections;
import java.util.*;

public class IteratorEg {
    public static void main(String[] args){
        ArrayList<Integer> l= new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);
        int size=l.size();
        System.out.println("the size of list is "+size);


        Iterator<Integer> it=l.iterator() ;

        System.out.println("manually printing "+it.next());
        System.out.println("manually printing "+it.next());



        for(int i=1;i<size;i++){
            if(it.hasNext()){
                System.out.println("printing the next iteration"+it.next());
            }
            else{
                System.out.println("list khatam");
            }
        }



    }
}
