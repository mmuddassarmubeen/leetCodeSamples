/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinimumPathSum;

/**
 *
 * @author Muddassar
 */
public class MinimumPathSum {
    
    public int minPathSum(int[][] grid) {
        
        if(grid.length == 0)
        {
            return 0;
        }
        int[][]res = new int[grid.length][grid[0].length];
        res[0][0] = grid[0][0];
        return recurseMinPath(grid,res);
    }
    
    private int recurseMinPath(int[][]grid,int[][] result)
    {
        for(int i=1;i<grid[0].length;i++)
        {
            result[0][i] = result[0][i-1] + grid[0][i];
        }
        for(int i=1;i<grid.length;i++)
        {
            result[i][0] = result[i-1][0] + grid[i][0];
        }
        for(int i=1;i<result.length;i++)
        {
            for(int j=1;j<result[0].length;j++)
            {
                result[i][j] = Math.min(result[i-1][j], result[i][j-1]) + grid[i][j];
            }
        }
        
        return result[grid.length-1][grid[0].length-1];
    }
    
    
}
