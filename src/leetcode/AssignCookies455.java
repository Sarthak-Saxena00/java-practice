package leetcode;

import java.util.Arrays;

public class AssignCookies455 {
    static int count=0;
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
return i;






//        //int size=s.length;
//        if(s.length<g.length)
//        {
//            for(int i=0;i<s.length;i++) {
//                if (s[i] >= g[i]) {
//                    count++;
//                }
//            }
//        }else {
//            //int size=g.length;
//            for(int i=0;i<g.length;i++) {
//                if (s[i] >= g[i]) {
//                    count++;
//                }
//            }
//       }
//return count;
    }
    public static void main(String[] args) {
        int[] child={1,2};
        int[] cookie={1,2,3};
        AssignCookies455 ac=new AssignCookies455();
        System.out.println(ac.findContentChildren(child,cookie));
    }
}
