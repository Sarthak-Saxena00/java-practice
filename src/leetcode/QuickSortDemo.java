package leetcode;

public class QuickSortDemo {

    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i =low;

        //traversing the array and swapping smaller values to newly created space
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){

                //swapping
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        // now for placing the index to the right position we need to make another space and there we can place or pivot

        arr[high]=arr[i];
        arr[i]=pivot;
        return i;
    }




    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pivotIndx= partition(arr, low, high);
            //recursion of method quickSort()
            quickSort(arr, low, pivotIndx-1);
            quickSort(arr,pivotIndx+1,high);
        }
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int low=0;
        int high= arr.length-1;

        quickSort(arr,low,high);
        //printing the sorted array
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
