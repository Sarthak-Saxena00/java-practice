package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleElement {

    public int single(int[] arr){
        HashMap<Integer,Integer> check=new HashMap<>();
        for(int num:arr){
            if(check.containsKey(num)){
                check.put(num,check.get(num)+1);
            }else{
                check.put(num,1);
            }
        }

        //printing
        for(Map.Entry<Integer,Integer> entry: check.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr={2,2,1};
        SingleElement se=new SingleElement();
        int nonRepeating =se.single(arr);
        System.out.println("the non repeating number of an array is---->"+nonRepeating);
    }
}
