package strings;

public class StringAllMethods {
    public static void main(String[] args){
        String str="this is a sample String";
        System.out.println(str);
        String str2= new String("this is second sample String");
        System.out.println(str2);

        //charAt()
        System.out.println("the 5th character is"+str.charAt(5));

        //int length()
        System.out.println("the length of str2 is "+str2.length());

        //subString(int beginning,int end)
        String subStr1=str.substring(5,10);
        System.out.println("the substring from 5th index to 10th index ----->"+subStr1);

        //Boolean contains
        System.out.println(str.contains("sample"));

        //Boolean equals
        System.out.println(str.equals(str2));

        //Boolean isEmpty()
        System.out.println("is substring of str is empty--->"+subStr1.isEmpty());

        //String concat()
        String stc="sarthak";
        String stc2="saxena";
        String finalStc=new String(stc.concat(" "+stc2));
        System.out.println("concat String is----->"+finalStc);

        //String replace
        String sReplace=str.replace("a","not a");
        System.out.println(sReplace);

        //String equalsIgnoreCase()
        String ignoreCase="sarthak";
        String ignoreCase2="sarTHAk";
        System.out.println("equals by ignoring the case------>"+ignoreCase.equalsIgnoreCase(ignoreCase2));

        //int indexOf(char)
        System.out.println(str.indexOf("is a"));

        //int indexOf(subString)
        System.out.println(str.indexOf("is a"));

       // String trim()
        System.out.println(str.trim());


        //String split()
        String splt="this is a sample string for split method";
        String[] words=splt.split("\\s",15);
        for(String w:words){
            System.out.println(w);
        }
    }
}
