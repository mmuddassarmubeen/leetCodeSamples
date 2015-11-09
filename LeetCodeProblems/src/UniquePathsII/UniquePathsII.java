/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniquePathsII;

/**
 *
 * @author Muddassar
 */
public class UniquePathsII {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length == 0)
        {
            return 1;
        }
        int[][] arr = new int[obstacleGrid.length][obstacleGrid[0].length];
        dpUniquePaths(obstacleGrid, arr);
        return arr[obstacleGrid.length-1][obstacleGrid[0].length-1] == -1? 0: arr[obstacleGrid.length-1][obstacleGrid[0].length-1];
        
    }
    
    private void dpUniquePaths(int[][] obstacleGrid, int[][] dp)
    {
        boolean rowFlag = false;
        boolean columnFlag = false;
        
        for(int i=0;i<obstacleGrid[0].length;i++)
        {
            if(obstacleGrid[0][i]==0 && !rowFlag)
            {
                dp[0][i] = 1;
            }
            else
            {
                dp[0][i] = 0;
                rowFlag = true;
            }
        }
        for(int i=0;i<obstacleGrid.length;i++)
        {
            if(obstacleGrid[i][0]==0 && !columnFlag)
            {
                dp[i][0] = 1;
            }
            else
            {
                columnFlag = true;
                dp[i][0] = 0;
            }
        }
        
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {   
                if(obstacleGrid[i][j]== 1)
                {
                    dp[i][j]=0;
                }
                else
                {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                
            }
        }
    }
    
}
