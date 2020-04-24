package Solution;

import java.util.ArrayList;
import java.util.HashMap;

public class Q36_validSuduku {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashMap<Character,Integer>> rowMap=new ArrayList<>();
        ArrayList<HashMap<Character,Integer>> colMap=new ArrayList<>();
        ArrayList<HashMap<Character,Integer>> boxMap=new ArrayList<>();

        for(int x=0;x<board.length;x++){
            rowMap.add(x,new HashMap<Character,Integer>());
            colMap.add(x,new HashMap<Character,Integer>());
            boxMap.add(x,new HashMap<Character,Integer>());

        }
        /* should get HashMap inside if statement... */
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                HashMap<Character,Integer> row=rowMap.get(i);
                HashMap<Character,Integer> col=colMap.get(j);

                int boxIdx=(i/3)*3+j/3;
                HashMap<Character,Integer> box=boxMap.get(boxIdx);

                if(board[i][j]!='.'){
                    row.put(board[i][j], row.getOrDefault(board[i][j],0)+1);
                    col.put(board[i][j], col.getOrDefault(board[i][j],0)+1);
                    box.put(board[i][j],box.getOrDefault(board[i][j],0)+1);

                    if(row.get(board[i][j])>1 || col.get(board[i][j])>1 || box.get(board[i][j])>1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
