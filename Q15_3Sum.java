package Solution;

import java.util.*;

public class Q15_3Sum {
//    2 pointer approach
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;

            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[l]);
                    tmp.add(nums[r]);
                    ans.add(tmp);
                    r--;
                    l++;
                }
                if(nums[l]+nums[r]<-nums[i]){
                    l++;
                }
                if(nums[l]+nums[r]>-nums[i]){
                    r--;
                }
            }
        }
        return new ArrayList<>(ans);
    }

//brutal force, time limit exceeded, O(n^4) time, too slow
//    public List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> ans=new HashSet<>();
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length;i++){
//            int target = -nums[i];
//            // Map<Integer,Integer> map=new HashMap<Integer,Integer>();
//            for(int j=i+1;j<nums.length;j++){
//                for(int k=j+1;k<nums.length;k++){
//                    if(nums[i]+nums[j]+nums[k]==0){
//                        ArrayList<Integer> tmp=new ArrayList<>();
//
//                        tmp.add(nums[i]);
//                        tmp.add(nums[j]);
//                        tmp.add(nums[k]);
//                        ans.add(tmp);
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(ans);
//    }
}
