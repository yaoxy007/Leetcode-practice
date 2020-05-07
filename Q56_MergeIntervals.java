package Solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Q56_MergeIntervals {
    private static class IntervalComp implements Comparator<int[]> {
        @Override
        public int compare(int[] a,int[] b){
            if(a[0]<b[0]) return -1;
            if(a[0]==b[0]) return 0;
            return 1;
        }
    }


    public int[][] merge(int[][] intervals) {
        Collections.sort(Arrays.asList(intervals), new IntervalComp());
        int l=intervals.length;
        LinkedList<int[]> ans=new LinkedList();

        for(int[] i:intervals){
            if(ans.isEmpty() || ans.getLast()[1] < i[0]){
                ans.add(i);
            }else{
                ans.getLast()[1] = Math.max(ans.getLast()[1],i[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
