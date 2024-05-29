package leetcode;

import java.util.Arrays;

public class ReverseArray {
    public void revArray(int arr[],int n){
        int[] newarr= new int[arr.length];
        for(int i=0;i<n;i++){
            newarr[i]=arr[n-i-1];
        }

        System.out.println("reversed array is --->"+Arrays.toString(newarr));



    }
    public static void main(String[] args){
        ReverseArray ra=new ReverseArray();
        int arr[]={1,2,3,4,5,6};
        System.out.println("original array is"+ Arrays.toString(arr));
        int n=arr.length;
        ra.revArray(arr,n);
    }
}
