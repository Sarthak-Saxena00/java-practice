package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] arr){
     int[] arrNew=new int[arr.length];
     int product=1;
     for(int i=0;i<arr.length;i++){
                  product=product*arr[i];

     }
        //System.out.println(product);
     for(int i=0;i< arr.length;i++){
         arrNew[i]=product/arr[i];
     }
        return arrNew;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ProductOfArrayExceptItself pe=new ProductOfArrayExceptItself();
        System.out.println(Arrays.toString(pe.productExceptSelf(arr)));
    }
}
