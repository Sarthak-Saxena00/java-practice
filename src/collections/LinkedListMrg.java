package collections;
import java.util.*;


public class LinkedListMrg {
    public static void main(String[] args){
        System.out.println("linked list");
        int len1, input1;
        System.out.println("enter the length of first linked list");
        Scanner s=new Scanner(System.in);
        len1 =s.nextInt();

        //creating linked list
        LinkedList<Object> l1=new LinkedList<>();
        for(int i = 1; i<= len1; i++){
            input1 =s.nextInt();
            l1.add(input1);
        }
        System.out.println("first linked list is"+l1);


        //creating second linked list
        int len2, input2;
        System.out.println("enter the length of second linked list");
        Scanner s2 =new Scanner(System.in);
        len2 = s2.nextInt();
        LinkedList<Object> l2 =new LinkedList<>();
        for(int i = 1; i<= len2; i++){
            input2 = s2.nextInt();
            l2.add(input2);
        }
        System.out.println("first linked list is"+ l2);


        //creating a new merged linked list
        System.out.println("merging both the linked list");
        LinkedList<Object> Ml=new LinkedList<>();
        Ml.addAll(l1);
        Ml.addAll(l2);


        System.out.println(Ml);


        System.out.println("enter the element u wanna add in merged linked list at 3rd index/place ");
        int newElement=s.nextInt();
        Ml.add(3,newElement);
        System.out.println("new linked list is "+Ml);


    }
}
