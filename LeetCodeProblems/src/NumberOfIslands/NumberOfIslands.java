/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberOfIslands;

/**
 *
 * @author Muddassar
 */
public class NumberOfIslands {
    
    public int numIslands(char[][] grid) {
        
        if(grid.length==0)
            return 0;
        int width = grid.length;
        int height = grid[0].length;
        int count = 0;
        
        for(int i=0;i<width;i++)
        {
            for(int j=0;j<height;j++)
            {
                if(grid[i][j] =='1')
                {
                    count++;
                    mergeIslands(grid,i,j);
                }
            }
        }
        
        
        return count;
    }
    
    private void mergeIslands(char[][] grid, int i, int j)
    {
        if(i<0 || i>grid.length-1)
        {
            return;
        }
        if(j<0 || j>grid[0].length-1)
        {
            return;
        }
        if(grid[i][j] == '1')
        {
            grid[i][j] = '0';
            mergeIslands(grid,i-1,j);
            mergeIslands(grid,i+1,j);
            mergeIslands(grid,i,j-1);
            mergeIslands(grid,i,j+1);
        }
    }
    
    
}
