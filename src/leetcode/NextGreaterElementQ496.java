//The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
//
//        You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
//
//        For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
//
//        Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
//
//
//
//        Example 1:
//
//        Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
//        Output: [-1,3,-1]
//        Explanation: The next greater element for each value of nums1 is as follows:
//        - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
//        - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
//        - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
//        Example 2:
//
//        Input: nums1 = [2,4], nums2 = [1,2,3,4]
//        Output: [3,-1]
//        Explanation: The next greater element for each value of nums1 is as follows:
//        - 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
//        - 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.


package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextGreaterElementQ496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //creating an empty array
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {

            int compare = nums1[i];
            System.out.println("comparing "+compare);

            int index = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (compare == nums2[j]) {
                    index = j;
                    System.out.println("the element which we are comparing found at index " + j);
                    break;
                }
            }
            if (index == -1) {
                System.out.println(compare+" isn't present in second array so the found index will be -1");
                System.out.println();
                System.out.println();
                System.out.println();
                result[i] = -1;
            } else {
                boolean found = false;
                for (int j = index + 1; j < nums2.length; j++) {
                    if (nums2[j] > compare) {
                        System.out.println("the next max Element is"+nums2[j]);
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        result[i] = nums2[j];
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("no next max element found");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    result[i] = -1;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] index={4,1,5,2};
        int[] check={1,3,4,2};
        NextGreaterElementQ496 nge=new NextGreaterElementQ496();
        System.out.println(Arrays.toString(nge.nextGreaterElement(index,check)));
     }
}
