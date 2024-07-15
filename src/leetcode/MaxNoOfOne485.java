package leetcode;

public class MaxNoOfOne485 {
    public int max(int[] nums){
        int count=0;
        int max1=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==1){
                count++;
                max1=Math.max(max1,count);
            }
            else if (nums[i]==0) {
                count=0;
            }
        }
        return max1;
            }
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,1,1,1,1};
        MaxNoOfOne485 mo=new MaxNoOfOne485();
        System.out.println(mo.max(arr));
    }
}
