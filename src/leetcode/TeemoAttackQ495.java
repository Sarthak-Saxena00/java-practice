//Our hero Teemo is attacking an enemy Ashe with poison attacks! When Teemo attacks Ashe, Ashe gets poisoned for a exactly duration seconds. More formally, an attack at second t will mean Ashe is poisoned during the inclusive time interval [t, t + duration - 1]. If Teemo attacks again before the poison effect ends, the timer for it is reset, and the poison effect will end duration seconds after the new attack.
//
//        You are given a non-decreasing integer array timeSeries, where timeSeries[i] denotes that Teemo attacks Ashe at second timeSeries[i], and an integer duration.
//
//        Return the total number of seconds that Ashe is poisoned.
//
//
//
//        Example 1:
//
//        Input: timeSeries = [1,4], duration = 2
//        Output: 4
//        Explanation: Teemo's attacks on Ashe go as follows:
//        - At second 1, Teemo attacks, and Ashe is poisoned for seconds 1 and 2.
//        - At second 4, Teemo attacks, and Ashe is poisoned for seconds 4 and 5.
//        Ashe is poisoned for seconds 1, 2, 4, and 5, which is 4 seconds in total.
//        Example 2:
//
//        Input: timeSeries = [1,2], duration = 2
//        Output: 3
//        Explanation: Teemo's attacks on Ashe go as follows:
//        - At second 1, Teemo attacks, and Ashe is poisoned for seconds 1 and 2.
//        - At second 2 however, Teemo attacks again and resets the poison timer. Ashe is poisoned for seconds 2 and 3.
//        Ashe is poisoned for seconds 1, 2, and 3, which is 3 seconds in total.


package leetcode;

import java.util.HashSet;
import java.util.Set;

public class TeemoAttackQ495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
       if(duration==0){
           return 0;
       }
       else {
           Set<Integer> hs=new HashSet<>();
           for(int i=0;i<timeSeries.length;i++){
               hs.add(timeSeries[i]);
               hs.add(timeSeries[i]+duration-1);
               System.out.println(hs);
           }
           //System.out.println(hs.size());
           return hs.size();
       }
    }
    public static void main(String[] args) {
        int[] attackTime={1,4};
        int duration=2;
        TeemoAttackQ495 ta=new TeemoAttackQ495();
        System.out.println(ta.findPoisonedDuration(attackTime,duration));
    }
}




//if (timeSeries == null || timeSeries.length == 0 || duration == 0) {
//        return 0;
//        }
//int total = 0;
//    for (int i = 0; i < timeSeries.length - 1; i++) {
//total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
//    }
//            return total + duration;
