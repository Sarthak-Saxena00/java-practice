package leetcode;

import java.util.HashSet;

public class RemoveDuplicates {
    public int remove(int[] num){
        HashSet<Integer> hs=new HashSet<>(num.length);
        for(int i=0;i<num.length;i++){
            hs.add(num[i]);
        }
        System.out.println(hs);
        return hs.size();
    }

    public static void main(String[] args) {
        int[] arr={1,1,2};
        RemoveDuplicates rd=new RemoveDuplicates();
        rd.remove(arr);
    }
}
