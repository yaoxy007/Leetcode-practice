package Solution;

public class Q59_SpiralMatrixI2 {
    //pretty much the same as Q54
    public int[][] generateMatrix(int n) {
        int[][] ans= new int[n][n];
        int count=1;
        int startRow=0,startCol=0;
        int maxRow=n-1, maxCol=n-1;

        while(startRow<=maxRow && startCol<=maxCol){
            for(int i=startCol;i<=maxCol;i++){
                ans[startRow][i]=count;
                count++;
            }
            for(int i=startRow+1;i<=maxRow;i++){
                ans[i][maxCol]=count;
                count++;
            }
            if(startRow<maxRow && startCol<maxCol){
                for(int i=maxCol-1;i>startCol;i--){
                    ans[maxRow][i]=count;
                    count++;
                }
                for(int i=maxRow;i>startRow;i--){
                    ans[i][startCol]=count;
                    count++;
                }
            }

            startRow++;
            startCol++;
            maxRow--;
            maxCol--;
        }

        return ans;
    }
}
