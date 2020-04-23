package Solution;

import java.util.ArrayList;
import java.util.HashMap;

public class Q36_validSuduku {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashMap<Character,Integer>> rowMap=new ArrayList<>();
        ArrayList<HashMap<Character,Integer>> colMap=new ArrayList<>();

        for(int x=0;x<board.length;x++){
            rowMap.add(x,new HashMap<Character,Integer>());
            colMap.add(x,new HashMap<Character,Integer>());
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                HashMap<Character,Integer> row=rowMap.get(i);
                HashMap<Character,Integer> col=colMap.get(j);
                if(board[i][j]!='.'){
                    row.put(board[i][j], row.getOrDefault(board[i][j],0)+1);
                    col.put(board[i][j], col.getOrDefault(board[i][j],0)+1);
                }
            }
        }
        return true;
    }
}
