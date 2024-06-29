package leetcode;

public class SearchInsertPositionQ35 {
    public int searchInsert(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else{
                if(target<nums[i]){
                    return i;
                }

           }
        }
        return nums.length;
    }

    public static void main(String[] args) {
    int[] arr={1,3,5,6};
    int target=7;
    SearchInsertPositionQ35 sip=new SearchInsertPositionQ35();
        System.out.println(sip.searchInsert(arr,target));
    }
}



//O(log n) solution  binary search :-
//     public int searchInsert(int[] nums, int target){
//     int left=0;
//     int right=nums.length-1;
//     while(left<=right)
//     {
//     int mid=left+(right-left)/2;
//     if(nums[mid]==target)
//       { return mid; }
//    else if( nums[mid] < target ){
//       left=mid+1;
//       }
//     else{
//         right=mid-1;
//          }
//    }end of while loop
//    return left;
//
//
//      }