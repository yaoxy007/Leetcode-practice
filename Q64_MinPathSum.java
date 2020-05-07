package Solution;

public class Q64_MinPathSum {
    //backtracking || recursive, always time limit exceeded:
//    int min=Integer.MAX_VALUE;
//
//    public int minPathSum(int[][] grid) {
//        backtrack(grid,0,0,0);
//        return min;
//    }
//
//    private void backtrack(int[][] grid,int i,int j,int count){
//        int row=grid.length;
//        int col=grid[0].length;
//
//        if(i==row-1 && j==col-1){
//            count=count+grid[i][j];
//            if(this.min>count){
//                this.min=count;
//                return;
//            }
//        }
//        if(i<row-1){
//            count=count+grid[i][j];
//            backtrack(grid,i+1,j,count);
//    need to subtract the grid here, because it will be added back in line 30:
//            count=count-grid[i][j];
//        }
//        if(j<col-1){
//            count=count+grid[i][j];
//            backtrack(grid,i,j+1,count);
//    need to subtract here, it will be added back in line 24
//            count=count-grid[i][j];
//        }
//    }
}
