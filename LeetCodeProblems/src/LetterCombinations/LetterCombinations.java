/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LetterCombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class LetterCombinations {
    
    HashMap<String,String> map = new HashMap<String,String>();
    public List<String> letterCombinations(String digits) {
        
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        ArrayList<String> finalResult = new ArrayList<String>();
        String[] tempResult = new String[digits.length()];
        backtrack(digits, 0, tempResult, finalResult);
       return finalResult;
        
    }
    
    public void backtrack(String s, int index, String[] res, ArrayList<String> finalResult)
    {
        if(index>res.length-1)
        {
            String ts = "";
            for(int k = 0;k<res.length;k++)
            {
                ts+=res[k];
            }
            finalResult.add(ts);
            return;
        }
        
        String value = map.get(s.substring(index,index+1));
        for(int j=0;j<value.length();j++)
        {
            res[index] = value.substring(j,j+1);
            backtrack(s,index+1,res,finalResult);
        }
        
    }
}
