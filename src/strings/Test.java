package strings;

import java.util.Arrays;

public class Test {



    public static void main(String[] args) {
int [] arr={-5, -2, 5, 2, 4, -7, 1, -81, -8 };
int[] arrNew= new int[arr.length];
int size=arr.length;
int a=0;
int s=a%2;
        System.out.println(s);


        for(int i=0;i<size;i++){
            if(arr[i]<0 && i%2!=0 ){
                System.out.println(arr[i]+" value is at wrong position ");
                System.out.println("we must swap them with their next element");
                //swapping
                int j=1;
                while(j%2==1){
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    j++;
                }

            }

        }
        System.out.println(Arrays.toString(arr));


    }
}


