package leetcode;

public class FindPeak {

    public void peak(int arr[], int n) {
        if (n == 1) {
            System.out.println(0);
        }
        if (arr[0] >= arr[1]) {
            System.out.println(0);
        }
        if (arr[n - 1] >= arr[n - 2]) {
            System.out.println(0);
        }
        for(int i=1;i<=n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args){
        FindPeak fp=new FindPeak();
     int arr[]={10,20,15,2,23,90,67};
     int n=arr.length;
      fp.peak(arr,n);

    }
}
