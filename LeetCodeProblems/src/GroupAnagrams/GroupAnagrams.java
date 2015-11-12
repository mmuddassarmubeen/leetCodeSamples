/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class GroupAnagrams {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        List<List<String>> finalResult = new ArrayList<List<String>>();
        for(String s : strs)
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if(map.containsKey(key))
            {
                map.get(key).add(s);
            }
            else
            {
                ArrayList<String> inp = new ArrayList<String>();
                inp.add(s);
                map.put(key,inp);
            }
                   
        }
        for(String k : map.keySet())
        {
            ArrayList<String> v = map.get(k);
            String[] ar = new String[v.size()];
            for(int i=0;i<v.size();i++)
            {
                ar[i] = v.get(i);
            }
            
            Arrays.sort(ar);
            
            ArrayList<String> tempResult = new ArrayList<String>();
            for(int j=0;j<ar.length;j++)
            {
                tempResult.add(ar[j]);
            }
            finalResult.add(tempResult);
        }
        return finalResult;
    }
}
