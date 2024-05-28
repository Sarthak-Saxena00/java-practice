package collections;
import java.util.*;
public class FindingCommonInArrayList {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length of arraylist");
        int len=s.nextInt();
        int input1=0;

        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i =1;i<=len;i++){
            System.out.println("enter the "+i+ "elements");
            input1=s.nextInt();
            l.add(input1);
        }
        System.out.println("first array list is "+l);


        System.out.println("enter the length of second array list");
        int len2 =s.nextInt();
        int input2 =0;

        ArrayList<Integer> l2 =new ArrayList<Integer>();
        for(int i = 1; i<= len2; i++){
            System.out.println("enter the "+i+ "elements");
            input2 =s.nextInt();
            l2.add(input2);
        }
        System.out.println("second array list is "+ l2);


//        System.out.println("using iterator in list 2");
//        Iterator<Integer>it = l2.iterator();
//        for(int i=1;i<=l2.size();i++){
//            System.out.println(it.next());
//        }


        System.out.println("making a new list which has common elements");
        ArrayList<Integer> commonElement = new ArrayList<>();
        commonElement.addAll(l);
        commonElement.retainAll(l2);
        System.out.println("common list"+commonElement);





    }
}
