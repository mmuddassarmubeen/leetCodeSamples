/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class CombinationSum {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     
     ArrayList<Integer> initialList = new ArrayList<Integer>();
     List<List<Integer>> result = new ArrayList<List<Integer>>();
     backtrack(candidates,initialList,result,target);
     return result;
        
    }
    
    public void backtrack(int[] candidates, ArrayList<Integer> currentList, List<List<Integer>> result, int target)
    {
        for(int i=0;i<candidates.length;i++)
        {
            if(candidates[i]<target && (currentList.size()<=0 || currentList.get(currentList.size()-1)<=candidates[i]))
            {
                currentList.add(candidates[i]);
                Collections.sort(currentList);
                backtrack(candidates,currentList,result,target-candidates[i]);
                currentList.remove(new Integer(candidates[i]));
            }
            else if(candidates[i]==target && (currentList.size()<=0 || currentList.get(currentList.size()-1)<=candidates[i]))
            {
                ArrayList<Integer> arr = new ArrayList<Integer>();
                for(int k : currentList)
                {
                    arr.add(k);
                }
                arr.add(candidates[i]);
                result.add(arr);
            }
        }
        
    }
    
}
