package leetcode;

public class MissingNumber268 {
    public int missing(int[] nums){
        int sumOfArray =0;
        for (int i=0;i< nums.length;i++){
            sumOfArray = sumOfArray +nums[i];
        }
        System.out.println(sumOfArray);
        int element= nums.length;
        System.out.println(element);

        int totalSum=(element*(element+1))/2;
        System.out.println(totalSum);

        int missingNumber=totalSum- sumOfArray;
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
MissingNumber268 mn=new MissingNumber268();
        System.out.println(mn.missing(arr));
    }
}
