package leetcode;

public class FindOccurrencesOfInteger {
    static int count=0;
    public void Occurrence(int arr[],int n,int key){
       for(int i=0;i<n;i++){
           if(key==arr[i]){
               count++;
           }
       }
        System.out.println("the key occurred->"+count+" times");
    }



    public static void main(String[] args){
        int[] arr={1,1,2,2,2,2,2,4,3};
        int n= arr.length;
        int key=2;
        FindOccurrencesOfInteger foi=new FindOccurrencesOfInteger();
        foi.Occurrence(arr,n,key);
    }
}
