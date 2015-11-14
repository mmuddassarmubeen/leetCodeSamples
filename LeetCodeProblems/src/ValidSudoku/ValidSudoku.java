/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidSudoku;

/**
 *
 * @author Muddassar
 */
public class ValidSudoku {
    
    public boolean isValidSudoku(char[][] board) {
     
        for(int i=0;i<board.length;i++)
        {
            int[] row = new int[board.length];
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j] != '.')
                row[board[i][j]]++;
            }
            if(!validateRow(row))
            {
                return false;
            }
        }
        return true;
    }
    
    private boolean validateRow(int[] row)
    {
        for(int i = 0;i<row.length;i++)
        {
            if(row[i]>1)
            {
                return false;
            }
        }
        return true;
    }
    
}
