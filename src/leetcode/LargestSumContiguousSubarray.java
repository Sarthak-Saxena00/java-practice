//Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum.
//
//Example:
//
//Input: arr = {-2,-3,4,-1,-2,1,5,-3}
//Output: 7
//Explanation: The subarray {4,-1, -2, 1, 5} has the largest sum 7.
//
//Input: arr = {2}
//Output: 2
//Explanation: The subarray {2} has the largest sum 1.




        package leetcode;

public class LargestSumContiguousSubarray {

    public void sumContiguousSubArray(int[] arr,int size){
int current_sum=0;
int max_sum =Integer.MIN_VALUE;
        System.out.println("setting the max_sum value very very low --->"+max_sum);
        for(int i=0;i<size;i++){
            current_sum=current_sum+arr[i];
            //for i=0;
            // 0=0+(-2);
            //current_sum=-2

            // (-214748... < -2)
            //max_sum=-2;


            if(max_sum<current_sum){
                max_sum=current_sum;
            }
             // (-2 < 0)
            // current_sum=0

            if(current_sum<0){
                current_sum=0;
            }
        }
        System.out.println("the largest sum of SubArray is"+max_sum);
    }


    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int size=arr.length;
        LargestSumContiguousSubarray lsaa=new LargestSumContiguousSubarray();
        lsaa.sumContiguousSubArray(arr,size);
    }
}
