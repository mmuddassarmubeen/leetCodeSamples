/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class CombinationSumII {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        ArrayList<Integer> currentList = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backtrack(candidates, target, currentList, result,0);
        return result;
    }
    
    private void backtrack(int[] candidates, int target, ArrayList<Integer> currentList, List<List<Integer>> result, int start)
    {
        for(int i =start;i<candidates.length;i++)
        {
            
            if(candidates[i]<target && (currentList.size()==0 || currentList.get(currentList.size()-1)<=candidates[i]))
            {
                currentList.add(candidates[i]);
                Collections.sort(currentList);
                backtrack(candidates,target-candidates[i],currentList,result,i+1);
                currentList.remove(new Integer(candidates[i]));
                while(i<=candidates.length-2 && candidates[i+1]== candidates[i])
                {
                    ++i;
                }
            }
            else if(candidates[i] == target && (currentList.size()==0 || currentList.get(currentList.size()-1)<=candidates[i]))
            {
                ArrayList<Integer> ar = new ArrayList<Integer>();
                for(int k : currentList)
                {
                    ar.add(k);
                }
                ar.add(candidates[i]);
                result.add(ar);
                while(i<=candidates.length-2 && candidates[i+1]== candidates[i])
                {
                    ++i;
                }
            }
            
        }
        
    }
}
