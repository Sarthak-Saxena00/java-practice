package scalerarray;

import java.util.Arrays;

public class RightRotation {

    public void rotation(int arraySize,int rotationBy){
        int[] A=new int[arraySize];
        for(int i=0;i<arraySize;i++){
            A[i]=i+1;
        }
        System.out.println("array created"+ Arrays.toString(A));
        System.out.println("rotation by---->"+rotationBy);

        //creating an empty array
        int[] newArray=new int[arraySize];

        int start=rotationBy-1;
        for(int i=start;i>=0;i--){
            newArray[i]=A[arraySize-rotationBy+i];
        }

        for(int i=arraySize-1;i>start;i--){
            newArray[i]=A[i-rotationBy];
        }
        System.out.println(Arrays.toString(newArray));
    }


    public static void main(String[] args) {
        int n=6;
        int B=3;
        RightRotation rr=new RightRotation();
        rr.rotation(n,B);
    }
}
