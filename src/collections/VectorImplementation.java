package collections;
import java.util.*;
public class VectorImplementation {
    public static void main(String[] args){
        Vector<Object> v=new Vector<>();
        System.out.println(v.capacity());

        for(int i=1;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v);
        v.addElement("leo");
        System.out.println(v);

        v.iterator();


        System.out.println("the capacity of vector is "+v.capacity());
        System.out.println("the size of vector is "+v.size());
    }
}
