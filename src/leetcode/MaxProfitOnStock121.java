package leetcode;

public class MaxProfitOnStock121 {
    public int maxProfit(int[] arr){
        int len=arr.length;
        int cheapestDay=0;
        int peakDay=0;

        int min=arr[0];
        int maxProfit=0;

        for(int i=0;i<len;i++){
            if(min>arr[i]) {
                min = arr[i];
                cheapestDay = i;
            }else if(arr[i]-min>maxProfit){
                maxProfit = arr[i] - min;
                peakDay = i;
            }
        }
        System.out.println("Buy on day " + cheapestDay + " at price " + min);
        System.out.println("Sell on day " + peakDay + " at price " + (min + maxProfit));
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1};
        MaxProfitOnStock121 mps=new MaxProfitOnStock121();
        System.out.println("the max profit is ---> "+mps.maxProfit(arr));
    }
}
