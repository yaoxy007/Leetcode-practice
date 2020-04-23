package Solution;

public class Q33_SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>nums[left]){ //always check for the side that does not contain pivot
                if(target>nums[left] && target<nums[mid]){
                    right=mid;
                }else{
                    left=mid;
                }
            }else{
                if(target>nums[mid] && target<nums[right]){
                    left=mid;
                }else{
                    right=mid;
                }
            }
        }
        return -1;
    }
}
