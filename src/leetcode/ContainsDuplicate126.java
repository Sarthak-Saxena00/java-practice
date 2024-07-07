package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate126 {
    public boolean duplicate(int[] nums ){
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
       ContainsDuplicate126 cd=new ContainsDuplicate126();
        System.out.println(cd.duplicate(arr));
    }
}
