//Given an array of integers of size N, the task is to find the first non-repeating element in this array.

  //      Examples:

//Input: {-1, 2, -1, 3, 0}
//Output: 2 3
//Explanation: The first number that does not repeat is : 2

//Input: {9, 4, 9, 6, 7, 4}
//Output: 6 7


package leetcode;

public class FindNonRepeating {
    public static void main(String[] args) {
        int arr[] = {9, 4, 9, 6, 7, 4};
        int size = arr.length;

        for(int pos=0;pos<size;pos++){

            boolean isRepeating=false;
            for(int j=0;j<size;j++){
                if(pos!=j && arr[pos]==arr[j]){
                    isRepeating=true;
                    break;
                }
            }
            if(!isRepeating){
                System.out.print(arr[pos]+" ");
            }
        }
    }
}

































//pos = 0, arr[pos] = 9
//Inner loop iterates over the array, finds a match at j = 2, sets isRepeating to true, and breaks out of the loop.
//Since isRepeating is true, the element 9 is not printed.

//        pos = 1, arr[pos] = 4
//Inner loop iterates over the array, finds a match at j = 5, sets isRepeating to true, and breaks out of the loop.
//Since isRepeating is true, the element 4 is not printed.

//        pos = 2, arr[pos] = 9
//Inner loop iterates over the array, finds a match at j = 0, sets isRepeating to true, and breaks out of the loop.
//Since isRepeating is true, the element 9 is not printed.

//        pos = 3, arr[pos] = 6
//Inner loop iterates over the array, doesn't find a match, and completes normally.
//Since isRepeating is false, the element 6 is printed.

//pos = 4, arr[pos] = 7
//Inner loop iterates over the array, doesn't find a match, and completes normally.
//Since isRepeating is false, the element 7 is printed.