package leetcode;

public class SubArrayOfSum {

    public void sumArray(int arr[],int n,int sum)
    {
        for(int i=0;i<n;i++){
            int currentSum=arr[i];

            if(currentSum==sum){
                System.out.println("sum found at index-->"+i);
            }
            else{
                for(int j=i+1;j<n;j++){
                    currentSum=currentSum+arr[j];
                    if(currentSum==sum){
                        System.out.println("sum found at index "+i+" to "+j);
                    }
//                    else{
//                        System.out.println("No subarray found");
//                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,4,20,3,10,5};
        int n = arr.length;
        int sum = 33;
        SubArrayOfSum sos=new SubArrayOfSum();
        sos.sumArray(arr,n,sum);
    }
}
