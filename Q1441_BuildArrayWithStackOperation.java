package Solution;

import java.util.ArrayList;
import java.util.List;

public class Q1441_BuildArrayWithStackOperation {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<String>();
        int i=1;
        int j=0;
        while(i<=n && j<target.length){
            ans.add("Push");
            if(target[j]!=i){
                ans.add("Pop");
                i++;
            }else{
                j++;
                i++;
            }
        }
        return ans;
    }
}
