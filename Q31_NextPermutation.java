package Solution;

import java.util.Arrays;

public class Q31_NextPermutation {
    public void nextPermutation(int[] nums) {
        int l=nums.length;
        int rev=l-2;
        while(rev>=0){
            if(nums[rev]<nums[rev+1]){
                break;
            }
            rev--;
        }

        //complete reverse case:
        if(rev<0){
            Arrays.sort(nums);
            return;
        }
        //normal case:
        int k=rev+1;
        while(k<l && nums[k]>nums[rev]){
            k++;
        }
        int tmp=nums[rev];
        nums[rev]=nums[k-1];
        nums[k-1]=tmp;

        Arrays.sort(nums,rev+1,nums.length);
    }
}
