//Given an array of positive and negative numbers, the task is to find if there is a subarray (of size at least one) with 0 sum.
//
//        Examples:
//
//Input: {4, 2, -3, 1, 6}
//Output: true
//Explanation:
//There is a subarray with zero sum from index 1 to 3.
//
//Input: {4, 2, 0, 1, 6}
//Output: true
//Explanation: The third element is zero. A single element is also a sub-array.


package leetcode;



public class SubArrayWithZeroSum {
    public void subArray(int[] arr,int size,int sum){
        for(int i=0;i<size;i++){
            int currentSum=arr[i];
            if(currentSum==sum){
                System.out.println("subArray found at index------> "+i);
            }
            else {
                for(int j=i+1;j<size;j++){
                    currentSum=currentSum+arr[j];
                    if(currentSum==sum){
                        System.out.println("subArray found at index------> "+i+" and "+j);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={4, 2, 0, 1, 6};
        int size= arr.length;
        int sum=0;
        SubArrayWithZeroSum sub0=new SubArrayWithZeroSum();
        sub0.subArray(arr,size,sum);
    }
}
