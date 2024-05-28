package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {




    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=1;i<=nums.length;i++)
        {
            int reqNumber=target-nums[i];
            if(hm.containsKey(reqNumber))
            {
                int[] arr={hm.get(reqNumber),i};
                return arr;
            }
            hm.put(nums[i],i);
        }
        return  null;
    }


public static void main(String[] args){
        int[] nums={1,2,3,4,5,6};

    System.out.println(Arrays.toString(twoSum(nums,7)));
}

}
