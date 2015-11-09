/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterleavingString;

/**
 *
 * @author Muddassar
 */
public class InterleavingString {
    
    public boolean isInterleave(String s1, String s2, String s3) 
    {
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        if(l3 == 1)
        {
            if(l2 == 1)
            {
                return s3.equals(s2);
            }
            else if(l1 == 1)
            {
                return s3.equals(s1);
            }
            
        }
        if(l1>0 && l2>0)
        {
            boolean val = isInterleave(s1.substring(1,l1),s2,s3.substring(1,l3)) || isInterleave(s1,s2.substring(1,l2),s3.substring(1,l3));
            return val;
        }
        else if(l1>0)
        {
            boolean val =  isInterleave(s1.substring(1,l1),s2,s3.substring(1,l3));
            return val;
        }
        else
        {
            boolean val = isInterleave(s1,s2.substring(1,l2),s3.substring(1,l3));
            return val;
        }
        
    }
}
