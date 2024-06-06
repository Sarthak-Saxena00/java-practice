package scalerarray;

public class MaxConsecutiveOnes {
    public void consecutiveOnes(int[] arr,int numberOfFlips){
       int start=0;
       int countZeros=0;
       int maxSoFar=0;

        for(int end = 0; end < arr.length; end++){
            if(arr[end]==0)
            {
                countZeros++;
            }
            while(countZeros>numberOfFlips){
                if(arr[start]==0){
                    countZeros--;
                }
                start++;

            }
            maxSoFar=end-start+1;


        }
        System.out.println(maxSoFar);
    }


    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int numberOfFlips=2;
        MaxConsecutiveOnes mco=new MaxConsecutiveOnes();
        mco.consecutiveOnes(arr,numberOfFlips);
    }
}
