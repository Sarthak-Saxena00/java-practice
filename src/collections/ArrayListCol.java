package collections;
import java.util.*;
public class ArrayListCol {
    public static void main(String[] args){
        //ArrayList l= new ArrayList();
        ArrayList<Object> l = new ArrayList<>();
        String s=new String("messi");
        l.add(10);
        l.add("sarthak");
        l.add(null);
        l.add('a');
        l.add(5);
        l.add(10);
        l.add(s);
        System.out.println(l);
        l.add( 5,"leo");
        System.out.println("the element at 3rd position is");
        System.out.println(l.get(3));
        System.out.println(l);

    }
}
