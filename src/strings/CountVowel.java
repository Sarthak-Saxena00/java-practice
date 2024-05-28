package strings;
 import java.util.Scanner;
public class CountVowel {
    static int count=0;
    public void cVowel(String str){
        int a=str.length();
        System.out.println(a);
        for(int i=0;i<a;i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u' ){
                count++;
            }

        }
        System.out.println("number of vowel is"+ count);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the String");
        String str=s.nextLine();

        CountVowel cv=new CountVowel();
        cv.cVowel(str);

    }
}