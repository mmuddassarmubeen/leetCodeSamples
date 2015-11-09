/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountDigitOne;

/**
 *
 * @author Muddassar
 */
public class CountDigitOne {
    public int countDigitOne(int n) {
        int count =0;
        
        for(int i=1;i<=n;i++)
        {
            int j = i;
            while(j>=1)
            {
                int k = j%10;
                if(k ==1)
                {
                    ++count;
                }
                j=j/10;
            }
        }
        return count;
        
    }
    
     public int countDigitOneBetter(int n) {
         
         int count = 0;
         for(int i=n;i>0;i=i/10)
         {
             
         }
         return count;
        
    }
}
