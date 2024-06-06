//test case
//A={1,2,3,4}
//B=7
//output=1

//A={1,2,2}
//B=4
//output=1

//A={1,2,4}
//B=4
//output=0




package scalerarray;

import java.util.Arrays;

public class GoodPairExist {

    public int solve(int[] A, int n, int B) {

        int[] arr = new int[A.length];
        //arr will initialize with 0
        arr[0] = A[0];
        for (int i = 1; i < n; i++) {
            arr[i] = A[i - 1] + A[i];
            if (arr[i] == B) {
                return 1;
            }

        }
        //System.out.println(Arrays.toString(arr));
        return 0;
    }


    public static void main(String[] args) {
        int A[] = {1, 2, 2};
        int size = A.length;
        int B = 4;
GoodPairExist gpe=new GoodPairExist();
        System.out.println(gpe.solve(A,size,B));

    }
}