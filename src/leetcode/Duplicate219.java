package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Duplicate219 {
    public Boolean duplicate(int[] nums,int k){
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(hm.containsKey(nums[i])&& i-hm.get(nums[i])<=k){
                return false;
            }
            hm.put(nums[i],i );
        }
        return false;

//        for(int i=0;i< nums.length;i++){
//            for(int j=i+1;j< nums.length;j++){
//                if(nums[i]==nums[j]){
//                    if((j-i)<=k){
//                        System.out.println(i);
//                        System.out.println(j);
//                        return true;
//                      }
////                    else {
////                        return false;
////                    }
//
//
//                }
//            }
//        }
//
//        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3};
        int k=2;
        Duplicate219 d=new Duplicate219();
        System.out.println(d.duplicate(arr,k));
    }
}

