package Solution;

import java.util.Arrays;

public class Q62_UniquePath {
    private int count=0;
//dp approach
    public int uniquePaths(int m, int n) {
        int[][] path=new int[m][n];

        for(int[] arr:path){
            Arrays.fill(arr,1);
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                path[i][j]=path[i-1][j]+path[i][j-1];
            }
        }
        return path[m-1][n-1];
    }

//    time limit exceeds when m n too large:
//    public int uniquePaths(int m, int n) {
//        backtrack(m,n);
//        return count;
//
//    }
//
//    private void backtrack(int m,int n){
//        if(m==1 && n==1){
//            this.count++;
//            return;
//        }
//        if(m>1){
//            backtrack(m-1,n);
//        }
//        if(n>1){
//            backtrack(m,n-1);
//        }
//    }
}
