package leetcode;

import java.util.Arrays;

public class MoveZeros {
    public void zeros(int[] nums){
        int left=0;
        for(int right = 0; right < nums.length; right++){
         if(nums[right]!=0){
             nums[left]=nums[right];
             left++;
         }
           // System.out.println(left);
            //System.out.println(Arrays.toString(nums));
        }
        while(left< nums.length){
            nums[left++]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12,0};
        MoveZeros mz=new MoveZeros();
        mz.zeros(arr);
    }
}
