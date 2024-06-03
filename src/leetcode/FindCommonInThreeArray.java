package leetcode;

import java.util.HashSet;

public class FindCommonInThreeArray {
    public static void main(String[] args) {
       int ar1[] = {1, 5,5};
       int ar2[] = {3,4,5,5,10};
       int ar3[] = {5,5,10,20};


       //added a boolean array printed to track whether the element at a specific index in ar1 has been printed or not.
        // If the element is printed, it sets printed[i] to true. Then, before printing the next element, it checks if printed[i] is false.
        // If it's false, it prints the element and sets printed[i] to true.
        // If it's true, it doesn't print the element

boolean[] printed=new boolean[ar1.length];
       for(int i=0;i<ar1.length;i++){
           for(int j=0;j<ar2.length;j++){
               if(ar1[i]==ar2[j] )
               {

                   for(int k=0;k<ar3.length;k++){
                       if(ar1[i]==ar3[k] && printed[i]==false){
                           System.out.print(" "+ar1[i]);
                           printed[i]=true;
                           break;
                       }
                   }
               }
           }

       }

    }
}

//Input:
//ar1[] = {1, 5, 10, 20, 40, 80}
//ar2[] = {6, 7, 20, 80, 100}
//ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
//Output: 20, 80
//
//Input:
//ar1[] = {1, 5, 5}
//ar2[] = {3, 4, 5, 5, 10}
//ar3[] = {5, 5, 10, 20}
//Output: 5, 5

