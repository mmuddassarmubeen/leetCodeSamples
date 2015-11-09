/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isPalindrome;

/**
 *
 * @author Muddassar
 */
public class IsPalindrome {
    
    public boolean isPalindrome(String s) {
        
        
        int i =0;
        int j = s.length()-1;
        while(i<=j)
        {
            String left = s.substring(i,i+1);
            String right = s.substring(j,j+1);
            if(!left.matches("[a-zA-Z0-9]"))
            {
                i++;
                continue;
            }
            if(!right.matches("[a-zA-Z0-9]"))
            {
                j--;
                continue;
            }
            if(!left.toLowerCase().equals(right.toLowerCase()))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
