package scalerarray;

public class MaxProfitOnStock {
    public void maxProfit(int[] arr){
        int len=arr.length;
        int cheapestDay=0;
        int peakDay=0;

        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<len;i++){
            if(min>arr[i]){
                min=arr[i];
               // System.out.println("the perfect time to buy the stock is day----> "+i+" at price"+arr[i]);
                cheapestDay=i;
            }
        }
        System.out.println("the cheapest day is to buy a stock is----> "+cheapestDay);

        for(int i=cheapestDay+1;i<len;i++){
         if(max<arr[i]){
             max=arr[i];
             peakDay=i;
         }
        }
        System.out.println("the max price of stock is---->"+max+" at day "+peakDay);
        int maxProfit=max-min;
        System.out.println("the max profit will be----->"+maxProfit);

    }
    public static void main(String[] args) {
        int[] arr={45,23,78,96,25,75,85};
        MaxProfitOnStock mps=new MaxProfitOnStock();
        mps.maxProfit(arr);
    }
}
