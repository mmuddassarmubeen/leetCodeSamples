/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegularExpressionMatching;

/**
 *
 * @author Muddassar
 */
public class RegexMatching {
    
    public boolean isMatch(String s, String p){
        
        if(s.length() == 0)
        {
            return false;
        }
        char[] input = s.toCharArray();
        char[] pattern = p.toCharArray();
        boolean match = false;
        for(int i=0;i<pattern.length;i++)
        {
            if(pattern[i]=='.' || pattern[i]==input[0])
            {
                match = true;
                int j = i+1;
                int k=1;
                while(match && k<input.length)
                {
                    if(j<pattern.length && pattern[j]=='*' )
                    {
                        if(pattern[j-1]=='.')
                        {
                            k = input.length;
                        }
                        else 
                        {
                            while(k<input.length && input[k] == pattern[j-1])
                            {
                                k++;
                            }
                            j++;
                        }
                    }
                    else if(j < pattern.length && k<input.length && (pattern[j]=='.' || input[k]== pattern[j]))
                    {
                        j++;
                        k++;
                    }
                    else
                    {
                        match = false;
                    }
                }
            }
            if(match)
            {
                return true;
            }
        }
        return false;
    }
    
}
