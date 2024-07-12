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
