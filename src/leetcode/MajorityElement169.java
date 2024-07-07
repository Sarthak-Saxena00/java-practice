//Given an array nums of size n, return the majority element.
//
//        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//        Example 1:
//
//        Input: nums = [3,2,3]
//        Output: 3
//        Example 2:
//
//        Input: nums = [2,2,1,1,1,2,2]
//        Output: 2




        package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    public int majority(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int num:arr){
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else{
                hm.put(num,1);
            }
        }
        //printing
        int maxCount=0;
        int majorityElement=-1;

        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount=entry.getValue();
                majorityElement=entry.getKey();

            }
        }
        return majorityElement;
    }




    public static void main(String[] args) {
        int[] arr={3,2,3,3,2};
        MajorityElement169 me=new MajorityElement169();
        int majorityElement=me.majority(arr);
        System.out.println("the majority element is--->"+majorityElement);
    }
}
