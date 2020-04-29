package Solution;

import java.util.ArrayList;
import java.util.List;

public class Q54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        if(matrix.length==0) return ans;

        int maxCOL=matrix[0].length-1;
        int maxROW=matrix.length-1;
        int startROW=0;
        int startCOL=0;

        while(startROW <= maxROW && startCOL <= maxCOL){
            for(int i=startCOL;i<=maxCOL;i++) ans.add(matrix[startROW][i]);

            for(int i=startROW+1;i<=maxROW;i++) ans.add(matrix[i][maxCOL]);

            if(startROW < maxROW && startCOL < maxCOL){
                for(int i=maxCOL-1;i>startCOL;i--) ans.add(matrix[maxROW][i]);
                for(int i=maxROW;i>startROW;i--) ans.add(matrix[i][startCOL]);
            }

            startROW++;
            maxROW--;
            startCOL++;
            maxCOL--;
        }
        return ans;
    }
}
