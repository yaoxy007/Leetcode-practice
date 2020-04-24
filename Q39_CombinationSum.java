package Solution;

import java.util.ArrayList;
import java.util.List;

public class Q39_CombinationSum {
    List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list=new ArrayList<>();
        backtrack(list,candidates,target,0);
        return ans;
    }

    private void backtrack(List<Integer> list, int[] input, int target,int idx){
        if(target==0){
            ans.add(new ArrayList(list));
            return;
        }
        if(target<0) return;

        for(int i=idx;i<input.length;i++){
            list.add(input[i]);
            backtrack(list,input,target-input[i],i);
            list.remove(list.size()-1);
        }
    }
}
