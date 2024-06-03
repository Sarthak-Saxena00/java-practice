

//int[] arr={1,2,3,4,5};
//output:-[5, 1, 2, 3, 4]

package leetcode;

import java.util.Arrays;

public class CyclicallyRotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int size= arr.length;
        int temp=0;
        temp=arr[size-1];
        for(int i=size-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
