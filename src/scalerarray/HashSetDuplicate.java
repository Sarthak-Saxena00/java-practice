package scalerarray;

import java.util.HashSet;

public class HashSetDuplicate {

    public void duplicate(int arr[]) {
        int size = arr.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            if(!hs.add(i)){
                System.out.println("the duplicate element is---->"+i);

            }
        }
    }

    public static void main(String[] args) {
        int num[]={1,5,7,9,3,7,1,2};
        HashSetDuplicate fd=new HashSetDuplicate();
      fd.duplicate(num);
    }
}
