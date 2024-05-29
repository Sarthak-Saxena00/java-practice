package leetcode;

import java.util.Arrays;

public class KthSmallestInArray {

    public void kthSmallest(int arr[],int n,int k){
        Arrays.sort(arr);
        System.out.println("the sorted array is---->"+Arrays.toString(arr));
        System.out.println("the Kth smallest element is---->"+arr[k-1]);
    }




    public static void main(String[] args){
        int arr[]={7,10,4,3,15,20};
        int n=arr.length;
        int key=4;
        KthSmallestInArray ksa=new KthSmallestInArray();
        ksa.kthSmallest(arr,n,key);
    }
}
