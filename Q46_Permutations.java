package Solution;

import java.util.ArrayList;
import java.util.List;

public class Q46_Permutations {
    private List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        backtrack(list,nums,0);
        return ans;
    }

    private void backtrack(List<Integer> list, int[] input, int idx){

        if(list.size()==input.length){
            this.ans.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<input.length;i++){
            //problem says DISTINCT array will be given, if original input includes replicas, this won't work
            if(!list.contains(input[i])){
                list.add(input[i]);
                backtrack(list,input,i);
                list.remove(list.size()-1);
            }
        }
    }
}
