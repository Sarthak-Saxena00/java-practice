//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//        Increment the large integer by one and return the resulting array of digits.
//
//
//
//        Example 1:
//
//        Input: digits = [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.
//        Incrementing by one gives 123 + 1 = 124.
//        Thus, the result should be [1,2,4].
//        Example 2:
//
//        Input: digits = [4,3,2,1]
//        Output: [4,3,2,2]
//        Explanation: The array represents the integer 4321.
//        Incrementing by one gives 4321 + 1 = 4322.
//        Thus, the result should be [4,3,2,2].
//        Example 3:
//
//        Input: digits = [9]
//        Output: [1,0]
//        Explanation: The array represents the integer 9.
//        Incrementing by one gives 9 + 1 = 10.
//        Thus, the result should be [1,0].







package leetcode;

import java.util.Arrays;

public class PlusOneQ66 {
    public int[] plusOne(int[] digits){
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
            System.out.println(sum);

        }
        if (carry > 0) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = carry;
            System.arraycopy(digits, 0, newArray, 1, digits.length);
            return newArray;
        }
        return digits;







//        int num=0;
//        for(int i=0;i< digits.length;i++){
//            num=num*10;
//            num=num+digits[i];
//        }
//        System.out.println(num);
//        int newNum=num+1;
//        System.out.println(newNum);
//
//        String str = String.valueOf(newNum);
//        int[] array = new int[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            array[i] = str.charAt(i) - '0';
//        }
//        return array;
    }



    public static void main(String[] args) {
        int[] arr={1,2,0};

        PlusOneQ66 po=new PlusOneQ66();
        System.out.println(Arrays.toString(po.plusOne(arr)));

    }
}
