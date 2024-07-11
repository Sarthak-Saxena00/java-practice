package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptionWithoutDivision {
    public void product(int[] arr){
        int[] arrL= new int[arr.length];
        int[] arrR= new int[arr.length];
        for(int i=1;i< arr.length;i++){
            arrL[0]=1;
            arrL[i]=arrL[i-1]*arr[i-1]; // Calculate the product of elements up to the current index
        }
        System.out.println("left array is"+Arrays.toString(arrL));


        for(int i=arr.length-2;i>=0;i--){
            arrR[arr.length-1]=1;
            arrR[i]=arrR[i+1]*arr[i+1];
        }
        System.out.println("right Array is "+Arrays.toString(arrR));

        //multiplying both array
        for(int i=0;i<arr.length;i++){
            arrL[i]=arrL[i]*arrR[i];
            System.out.println(Arrays.toString(arrL));
        }


    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        ProductOfArrayExceptionWithoutDivision pwd=new ProductOfArrayExceptionWithoutDivision();
        pwd.product(arr);

    }
}
