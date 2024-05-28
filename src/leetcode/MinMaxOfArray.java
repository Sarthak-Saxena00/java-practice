package leetcode;

public class MinMaxOfArray {
    public void min(int arr[],int n){
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min of array is---->"+min);
    }

    public void max(int arr[],int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the max of an array is---->"+max);
    }


    public static void main(String[] args){

        int arr[]={45,23,2,56,1};
        int n=arr.length;
        MinMaxOfArray mna=new MinMaxOfArray();
        mna.min(arr,n);
        mna.max(arr,n);
    }
}
