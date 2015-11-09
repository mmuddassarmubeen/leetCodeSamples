/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BestTimeBuySell;

/**
 *
 * @author Muddassar
 */
public class BestTimeBuySell {
    
    
    public int maxProfit(int[] prices) {
     
        if(prices.length ==0)
        {
            return 0;
        }
        int maxDiff=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            min = Math.min(prices[i],min);
            maxDiff = Math.max(prices[i]-min,maxDiff);
        }
        return maxDiff;
        
    }
}
