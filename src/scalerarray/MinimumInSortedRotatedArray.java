//the og array is--->[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//the new complete array is--->[7, 8, 9, 10, 1, 2, 3, 4, 5, 6]
//finding minimum
//the minimum of an array is------>1



package scalerarray;

import java.util.Arrays;

public class MinimumInSortedRotatedArray {
    public void minimumFn(int size,int rotation){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=i+1;
        }
        System.out.println("the og array is--->"+Arrays.toString(arr));
        int arrnew[]=new int[size];
        //System.out.println("the new empty array is--->"+Arrays.toString(arrnew));

        int startPos=rotation-1;
        for(int i=size-1;i>startPos;i--){
           arrnew[i]=arr[i-rotation];
       }
       // System.out.println("the new right array is--->"+Arrays.toString(arrnew));

        for(int i=startPos;i>=0;i--){
            arrnew[i]=arr[size-rotation+i];
        }
        System.out.println("the new complete array is--->"+Arrays.toString(arrnew));


        System.out.println("finding minimum");
        int min=arr[0];
        for(int i=0;i<size;i++){
            if(min>arrnew[i]){
                min=arrnew[i];
            }
        }
        System.out.println("the minimum of an array is------>"+min);

    }


    public static void main(String[] args) {
        int number=10;
        int rotateBY=4;
        MinimumInSortedRotatedArray msr=new MinimumInSortedRotatedArray();
        msr.minimumFn(number,rotateBY);
    }

}

