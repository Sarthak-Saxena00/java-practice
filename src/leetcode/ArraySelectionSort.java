package leetcode;

import java.util.Arrays;

public class ArraySelectionSort {

    public void selectionSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
        System.out.println("sorted array is--->"+ Arrays.toString(arr));
    }
public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}




    public  static void main(String[] args){
        int[] arr={20,10,40,30,15,50};
        int n=arr.length;
        System.out.println("original array is---->"+Arrays.toString(arr));
        ArraySelectionSort ass=new ArraySelectionSort();
        ass.selectionSort(arr,n);
    }
}
