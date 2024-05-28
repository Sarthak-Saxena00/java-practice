package collections;
import java.util.*;
public class ArrayListTraversing {
    public static void main(String[] args){
        System.out.println("making a Arraylist");
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=1;i<=10;i++){
            al.add(i);
        }
        System.out.println("simpling printing arraylist"+al);

        System.out.println("enter the integer element u wanna add in it");
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        al.add(a);
        al.add(10);

        System.out.println(" getting arraylist using for loop and using get .method of Arraylist after inserting -->"+a);
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("the size of new Arraylist after adding input by user and 10 is---->"+al.size());

        System.out.println("by using the while loop I'm removing value from index 2-6");
        int start=6;
        while(start>=2){
            al.remove(start);
            start--;
        }
        System.out.println("Arraylist after .remove() method"+al);


//        for(int i=6;i>=2;i--){
//            al.remove(i);
//        }
//        System.out.println("by for loop removing"+al);


        System.out.println("using iterator to print newly formed list");
Iterator<Integer> itr=al.iterator();
while (itr.hasNext()){
    System.out.println("the element is "+itr.next());
}


  // reversing an arraylist
        System.out.println("this is a original arraylist"+al);
        System.out.println("this is a reversed arraylist "+al.reversed());

        //clone()
        ArrayList<Integer> alClone=(ArrayList<Integer>)al.clone();
        System.out.println("clone arraylist alClone is"+alClone);


    }
}
