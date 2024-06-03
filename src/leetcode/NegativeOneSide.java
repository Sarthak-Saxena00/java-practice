package leetcode;

import java.util.Arrays;

public class NegativeOneSide {
    public void oneSide(int arr[],int n){
        int arrNew[]=new int[n];
        int negIndex=0;
        int posIndex=n-1;

              for(int i=0;i<n;i++){
                  if(arr[i]<0){
                      arrNew[negIndex]=arr[i];
                      negIndex++;
                  }
                  else{
                      arrNew[posIndex]=arr[i];
                      posIndex--;
                  }
              }
        System.out.println("new array is "+Arrays.toString(arrNew));
    }




    public static void main(String[] args){
    int arr[]={-12,11,-13,-5,6,-7,5,3,-6};
    int n=arr.length;
    NegativeOneSide nos=new NegativeOneSide();
    nos.oneSide(arr,n);
    }
}


//test case--->
//input = [-12,11,-13,-5,6,-7,5,3,-6]
//output= [-12, -13, -5, -7, -6, 3, 5, 6, 11]