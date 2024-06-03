//Input: arr[] = {1, 5, 7, -1}, K = 6
//Output:  2
//Explanation: Pairs with sum 6 are (1, 5) and (7, -1).
//
//Input: arr[] = {1, 5, 7, -1, 5}, K = 6
//Output:  3
//Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).





        package leetcode;

public class CountPairOfGivenSum {
    static int count=0;
    public static void main(String[] args) {
        int[] arr={ 10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int sum=11;
        int n= arr.length;

        for(int pos=0;pos<n;pos++){
            for(int i=pos+1;i<n;i++){
                if((arr[pos]+arr[i])==sum){
                    count++;
                }
            }
        }
        System.out.println("the number of pairs which sum is "+sum+"are ---->"+count);
    }
}
