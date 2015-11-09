/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountPrimes;

import java.util.ArrayList;

/**
 *
 * @author Muddassar
 */
public class CountPrimes {
    
    public int countPrimes(int n){
        int count = 0;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i=2;i<n;i++)
        {
            boolean prime = true;
            for(int j : primes){                
                if(j>Math.sqrt(i)+1)
                {
                    break;
                }
                if(i%j == 0 )
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
            {
                primes.add(i);
                count++;
            }
        }
        return count;
    }
    
}
