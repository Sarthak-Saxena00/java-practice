//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//
//
//
//        Example 1:
//
//        Input: nums = [4,3,2,7,8,2,3,1]
//        Output: [5,6]
//        Example 2:
//
//        Input: nums = [1,1]
//        Output: [2]
//



package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearingNumber448 {
    public List<Integer> missing(int[] nums){
        int size= nums.length;
        int[] arrchk=new int[size];

        for(int i=0;i<size;i++){
           int put=nums[i];
            arrchk[put-1]++;
        }
        //System.out.println(Arrays.toString(arrchk));
        ArrayList<Integer> missingElement =new ArrayList<>();
        for(int i=0;i<size;i++){
            if(arrchk[i]==0){
                missingElement.add(i+1);

            }
        }
        return missingElement;
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        FindDisappearingNumber448 fdn= new FindDisappearingNumber448();
        System.out.println(fdn.missing(arr));;
    }
}
