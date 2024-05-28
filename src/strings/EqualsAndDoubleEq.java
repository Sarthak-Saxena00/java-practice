package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EqualsAndDoubleEq {
    public static void main(String[] args){
        String s=new String("sarthak");
        String s2= new String("sarthak");

        System.out.println(s==s2);
        System.out.println(s.equals(s2));

        int[] ar={1,2,3};
        int[] ar2={1,2,3};
//        for (int i = 0; i < ar.length; i++) {
//            System.out.print(ar[i]);
//        }
        System.out.println(ar.equals(ar2));// false
        System.out.println(Arrays.equals(ar,ar2));


    }
}
