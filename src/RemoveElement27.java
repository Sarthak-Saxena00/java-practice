import java.util.Arrays;

public class RemoveElement27 {
    public int removeElement(int[] nums ,int val){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,2,3,0,4,2};
        int val=2;
        RemoveElement27 re=new RemoveElement27();
        int remaining=re.removeElement(arr,val);
        System.out.println("the total elements which are not equal to given val ---->"+remaining);

        //printing the remaining element which are not equal to val
        for (int i=0;i<remaining;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
