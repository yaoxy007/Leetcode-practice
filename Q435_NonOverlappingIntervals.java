package Solution;

import java.util.Arrays;
import java.util.Comparator;

public class Q435_NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0){
            return 0;
        }

        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1,int[] o2){
                if(o1[0]==o2[0]){
                    return Integer.compare(o1[1],o2[1]);
                }else{
                    return Integer.compare(o1[0],o2[0]);
                }
            }
        });

        int end=intervals[0][1];
        int prev = 0;
        int count = 0;

        for(int i=1;i<intervals.length;i++){
            if(intervals[prev][1]>intervals[i][0]){
                if(intervals[prev][1]>intervals[i][1]){
                    prev=i;
                }
                count++;
            }else{
                prev = i;
            }
        }
        return count;
    }

}
