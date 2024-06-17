package leetcode;
import java.util.*;

public class NumberOfPlatform {

    public void platform(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int size = arr.length;
        int platform = 1;
        int result = 1;
        int i = 1, j = 0;
        while (i < size && j < size) {
            if (arr[i] <= dep[j]) {
                platform++;
                i++;
            } else {
                platform--;
                j++;
            }
            if (platform > result) {
                result = platform;
            }
        }
        System.out.println("The number of platforms needed is " + result);
    }

    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

        NumberOfPlatform nop = new NumberOfPlatform();
        nop.platform(arr, dep);
    }
}