package strings;

public class ReverseString {
    public static void main(String[] args){
        String s="sarthak";
        int a=s.length()-1;
        System.out.println(a);
        for (int i=a;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
