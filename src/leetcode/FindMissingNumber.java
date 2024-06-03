//Input: arr[] = {1, 2, 4, 6, 3, 7, 8} , N = 8
//        Output: 5
//        Explanation: Here the size of the array is 8, so the range will be [1, 8].
//        The missing number between 1 to 8 is 5

//Input: arr[] = {1, 2, 3, 5}, N = 5
//        Output: 4
//        Explanation: Here the size of the array is 4, so the range will be [1, 5].
//        The missing number between 1 to 5 is 4


package leetcode;

import java.util.Arrays;


public class FindMissingNumber {
    public static void main(String[] args) {

        int [] arr={1,2,6,4,5,3,8};
        int n=arr.length+1;

        System.out.println("the OG array is---->"+Arrays.toString(arr));

        //creating new array with n size and initializing with it's all element as 0
        int[] arrNew= new int[n];
        for(int i=0;i<n;i++){
            arrNew[i]=0;
        }
        System.out.println(Arrays.toString(arrNew));

        for(int i: arr){
            System.out.println("when i is--->"+i);
            int j=i-1;
            System.out.println("then j is..."+j);
            arrNew[j]=1;
        }
        System.out.println("the new array is"+Arrays.toString(arrNew));

        for(int i=0;i<n;i++){
            if(arrNew[i]==0){
                System.out.println("the missing number is ------->"+(i+1));
            }
        }




    }
}

