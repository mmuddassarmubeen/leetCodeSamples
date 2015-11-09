/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseInteger;

/**
 *
 * @author Muddassar
 */
public class ReverseInteger {
    
    public int reverse(int x) {
        
        int y = 0;
        int z = Math.abs(x);
        while(z>0)
        {
            y = y*10 + (z%10);
            z = z/10;
        }
        if(x<0)
        {
            y = -y;
        }
        return y;
    }
    
}
