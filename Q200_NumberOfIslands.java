package Solution;

public class Q200_NumberOfIslands {
    private void DFS(char[][] input, int r, int c){
        int maxRow=input.length;
        int maxCol=input[0].length;

        if(r<0 || c<0 || r>=maxRow ||c>=maxCol || input[r][c]=='0'){
            return;
        }else{
            input[r][c]='0';
            DFS(input,r-1,c);
            DFS(input,r+1,c);
            DFS(input,r,c-1);
            DFS(input,r,c+1);
        }
    }

    public int numIslands(char[][] grid) {

        int ans=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    DFS(grid,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }
}
