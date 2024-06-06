package scalerarray;

public class TimeToEqual {
    public void times(int[] arr,int size){
        int max=arr[0];
        int timeTaken=0;
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<size;i++){
            int time=max-arr[i];
            timeTaken+=time;
        }
        System.out.println("time taken to equal all element is----->"+timeTaken);
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,3,2};
        int size=arr.length;
        TimeToEqual toe=new TimeToEqual();
        toe.times(arr,size);
    }
}
