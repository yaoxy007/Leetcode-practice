package Solution;

import java.util.Arrays;

public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        //g: greed factor
        //s: candy size

        int count=0;

        for(int i=0;i<s.length;i++){
            for(int j=count;j<g.length;j++){
                if(g[j]<=s[i]){
                    count++;
                    break;
                }else{
                    break;
                }
            }
        }

        return count;

    }
}
