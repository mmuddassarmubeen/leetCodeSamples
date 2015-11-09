/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniquePaths;

/**
 *
 * @author Muddassar
 */
public class UniquePaths {
    
    public int uniquePaths(int m, int n) {
        
        if(n==0 && m!=0)
        {
            return 1;
        }
        if(m==0 && n!=0)
        {
            return 1;
        }
        int[][] arr = new int[m][n];
        for(int i=1;i<m;i++)
        {
            arr[i][0] = 1;
        }
        for(int i=1;i<n;i++)
        {
            arr[0][i] = 1;
        }
         recurse(m-1,n-1,arr);
         return arr[m-1][n-1];
        
    }
    
    private int recurse(int m, int n,int[][]arr)
    {
        if(m==0 && n==0)
        {
            arr[m][n] = 1;
            return 1;
        }
        if(arr[m][n]!=0)
        {
            return arr[m][n];
        }
        arr[m][n] = recurse(m-1,n,arr) + recurse(m,n-1,arr);
        return arr[m][n];
    }
    
}
