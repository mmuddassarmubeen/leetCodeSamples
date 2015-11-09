/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerfectSquares;

/**
 *
 * @author Muddassar
 */
public class PerfectSquares {
    
    public int numSquares(int n) {
     
        
        int[] res = new int[n];
        return recurseDP(n, res);
    }
    
    private int recurseDP(int n, int[] res)
    {
        if(n==0)
        {
            return 0;
        }
        res[0] = 1;
        
        if(res[n-1] !=0)
        {
            return res[n-1];
        }   
        
        for(int j =2;j<=n;j++)
        {
            Double v = Math.sqrt(j);
            int m = v.intValue();
            res[j-1] = j;
            for(int k =1;k<=m;k++)
            {
                res[j-1] = Math.min(res[j-1], 1+recurseDP(j-k*k,res));
            }
        }
        return res[n-1];
    }
}
