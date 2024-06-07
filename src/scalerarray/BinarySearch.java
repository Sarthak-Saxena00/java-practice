package scalerarray;

public class BinarySearch {

    public void search(int arr[], int start, int end,int key){
if(end>=start){
    int mid=(end+(start-1))/2;

    if(arr[mid]==key){
        System.out.println("the searched element "+key+" is found on---->"+mid+"th position");
    }
    if(arr[mid]<key){
        search(arr, mid+1, end, key);
    }
    if(arr[mid]>key){
        search(arr, start, mid-1, key);
    }
}

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,10,14,18,19,25,35,49,56,78,98};
        int end =arr.length;
        int start=0;
        int searchNumber=98;
        BinarySearch bs=new BinarySearch();
        bs.search(arr,start,end,searchNumber);
    }
}
