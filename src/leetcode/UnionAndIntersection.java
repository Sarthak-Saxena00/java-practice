package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1={1,3,4,5,7};
        int[] arr2={2,3,5,6};

//        ArrayList<Integer> union=new ArrayList<>();
//        ArrayList<Integer> intersection=new ArrayList<>();

        HashSet<Integer> union=new HashSet<>();
        ArrayList<Integer> intersection =new ArrayList<>();

        for (int i:arr1){
            union.add(i);
        }
        for (int i:arr2){
            union.add(i);
        }
        System.out.println("the union of both array is"+union);

        for (int i : arr1) {
            if (contains(arr2, i)) {
                intersection.add(i);
            }
        }
        System.out.println("the intersection of array is "+intersection);

        }

    private static boolean contains(int[] arr, int elem) {
        for (int i : arr) {
            if (i == elem) {
                return true;
            }
        }
        return false;
    }



    }

