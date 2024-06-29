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
