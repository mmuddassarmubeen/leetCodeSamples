/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClimbingStairs;

/**
 *
 * @author Muddassar
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        return recurse(n,new int[n]);
        
    }
    
    private int recurse(int n, int[] arr)
    {
        if(n == 1)
        {
            arr[0] = 1;
            return 1;
        }
        if(n == 2)
        {
            arr[1] = 2;
            return 2;
        }
        if(arr[n-1]!=0)
        {
            return arr[n-1];
        }
        arr[n-1] = recurse(n-1, arr) + recurse(n-2,arr);
        return arr[n-1];
    }
}

