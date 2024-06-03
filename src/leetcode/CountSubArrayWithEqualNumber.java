//Given an array arr[] of size n containing 0 and 1 only. The problem is to count the subarrays having an equal number of 0’s and 1’s.
//
//        Examples:
//
//Input: arr[] = {1, 0, 0, 1, 0, 1, 1}
//Output: 8
//Explanation: The index range for the 8 sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), (4, 5)(2, 5), (0, 5), (1, 6)
//
//Input: arr = { 1, 0, 0, 1, 1, 0, 0, 1}
//Output: 12





package leetcode;

public class CountSubArrayWithEqualNumber {

    static int countSubArray=0;

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 1, 0, 0, 1};
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int count1 = 0;
            int count0 = 0;


            for (int j = i; j < size; j++) {
                if (arr[j] == 1) {
                    count1++;
                }
                if (arr[j] == 0) {
                    count0++;
                }
                if(count1==count0){
                    System.out.println(" "+i+" "+j);
                    countSubArray++;
                }
            }
        }

        System.out.println("the number of sub Arrays which have equal number of 0 and 1 is ----->"+countSubArray);
    }
}



