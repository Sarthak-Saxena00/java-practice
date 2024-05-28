package collections;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(null);
        al.add("sarthak");
        al.add(25);
        al.add(new Object());

        Object o=(Object) al.get(3);
        System.out.println(o);

        String a= (String) al.get(1);
        System.out.println(a);



        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(12);
        al2.add(25);
        Object o2=al2.get(0);
        System.out.println(o2);

    }
}
