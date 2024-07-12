//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
//
//
//
//        Example 1:
//
//        Input: nums = [3,2,1]
//        Output: 1
//        Explanation:
//        The first distinct maximum is 3.
//        The second distinct maximum is 2.
//        The third distinct maximum is 1.
//        Example 2:
//
//        Input: nums = [1,2]
//        Output: 2
//        Explanation:
//        The first distinct maximum is 2.
//        The second distinct maximum is 1.
//        The third distinct maximum does not exist, so the maximum (2) is returned instead.
//        Example 3:
//
//        Input: nums = [2,2,3,1]
//        Output: 1
//        Explanation:
//        The first distinct maximum is 3.
//        The second distinct maximum is 2 (both 2's are counted together since they have the same value).
//        The third distinct maximum is 1.


package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ThirdMaxArrayQ414 {
    public int thirdMax(int[] nums){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i< nums.length;i++){
            hs.add(nums[i]);
        }
        ArrayList<Integer> al=new ArrayList<>(hs);
        System.out.println(al);
        //sorting an Arraylist
        Collections.sort(al);
        if(al.size()>=3){
            //System.out.println(al.get(al.size()-3));
            return al.get(al.size()-3);
        }
//        else {
//            System.out.println(al.get(al.size()-1));
//        }


return al.get(al.size()-1);
    }










    public static void main(String[] args) {
        int[] arr={3,2,2,1};
        ThirdMaxArrayQ414 tmx=new ThirdMaxArrayQ414();
        System.out.println(tmx.thirdMax(arr));
    }
}
