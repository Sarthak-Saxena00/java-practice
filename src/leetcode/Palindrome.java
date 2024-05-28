package leetcode;

public class Palindrome {
    public static boolean chkPalindrome(int x){
        int rev=0;
        int OG_num=x;
        if (x < 0) {
            return false;
        }
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        return OG_num==rev;
    }
    public static void main(String[] args)
    {
        int num=121;
        System.out.println(chkPalindrome(num));
    }
}
