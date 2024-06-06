package scalerarray;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzzProblem {

    public void fizzBuzz(int input){

        String[] arr=new String[input];
        for(int i=0;i<input;i++){
            arr[i]=String.valueOf(i+1);
            if(Integer.valueOf(arr[i])%15==0 ){
                arr[i]="FizzBuzz";
            } else if (Integer.valueOf(arr[i])%5==0) {
                arr[i]="Buzz";
            } else if (Integer.valueOf(arr[i])%3==0) {
                arr[i]="Fizz";
            }

        }
        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int A=15;
        FizzBuzzProblem fzb=new FizzBuzzProblem();
        fzb.fizzBuzz(A);
    }
}
