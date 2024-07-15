//Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".
//
//
//
//        Example 1:
//
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.


package strings;

import java.util.Arrays;

public class LongestCommonPrefixQ14 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        String first=strs[0];
        String last=strs[strs.length-1];
        System.out.println(first);
        System.out.println(last);

        int i=0;
        while(i<first.length()){
            if(first.charAt(i)==last.charAt(i)){
                i++;
            }
            else {
                break;
            }
        }
        if(i==0){
            return "";
        }
        else {
            return first.substring(0,i);
        }

    }
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        LongestCommonPrefixQ14 lcp=new LongestCommonPrefixQ14();
        System.out.println(lcp.longestCommonPrefix(str));
    }
}
