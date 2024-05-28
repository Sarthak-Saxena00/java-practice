package collections;
import java.util.*;
public class ReverseArrayList {
    public static void main(String[] args){
        System.out.println("enter the length of ArrayList");
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        int input1=0;

        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i =1;i<=len;i++){
            System.out.println("enter the "+i+ "elements");
            input1=s.nextInt();
            l.add(input1);
        }
        System.out.println("original input was"+l);

        System.out.println("length is"+len);

        System.out.println("reversing the arrayList");
ArrayList<Integer> l2= new ArrayList<>();

try{
    for(int i=len-1;i>=0;i--){
        l2.add(l.get(i));
    }
    System.out.println(l2);
}
catch (IndexOutOfBoundsException e){
    System.out.println("out of bound exception");
    System.out.println(e.getMessage());
}


        System.out.println("code continues :) ");

        System.out.println("enter the index on which u wanna check");
        int indx;
        indx=s.nextInt();
        System.out.println(l.get(indx));


        l.add(86);
        System.out.println("new arraylist after adding 86");
        System.out.println(l);
    }
}
