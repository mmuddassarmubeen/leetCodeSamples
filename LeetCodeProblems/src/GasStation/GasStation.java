/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GasStation;

/**
 *
 * @author Muddassar
 */
public class GasStation {
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int index = 0;
        int diffRequired = 0;
        int remaining = 0;
        for(int i=0;i<gas.length;i++)
        {
            if(gas[i]-cost[i]+remaining<0)
            {
                index = i+1;
                diffRequired +=cost[i]-gas[i];
            }
            else
            {
                remaining += gas[i]-cost[i]; 
            }
        }
        if(remaining >= diffRequired)
        {
            return index;
        }
        return -1;
    }
    
}
