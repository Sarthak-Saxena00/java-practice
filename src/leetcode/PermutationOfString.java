//incomplete



package leetcode;

import java.util.HashMap;

public class PermutationOfString {

    public void countCharacter(String str) {
        int len=str.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c: str.toCharArray())
        {
            if(hm.containsKey(c))
            {
                int count=hm.get(c)+1;
                hm.put(c,count);
            }
            else {
                hm.put(c,1);
            }
        }
        for (HashMap.Entry<Character, Integer> entry : hm.entrySet())
        {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }



    }
    public static void main(String[] args) {
        String str = "sarthak";
PermutationOfString pos=new PermutationOfString();
pos.countCharacter(str);
        }

}

