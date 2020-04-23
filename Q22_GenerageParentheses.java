package Solution;

import java.util.ArrayList;
import java.util.List;

public class Q22_GenerageParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        generate(ans,0,0,"",n);
        return ans;
    }

    private void generate(List<String> ans, int left, int right, String s, int max){
        if(s.length() == max*2){
            ans.add(s);
            return;
        }
        if(left<max){
            generate(ans,left+1,right,s+"(",max);
        }
        if(right<left){
            generate(ans,left,right+1,s+")",max);
        }
    }
}
