/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subsets;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class Subsets {
    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        //backtrack(nums, results);
        return results;
    }
    
    private void backtrack(int[] nums, List<List<Integer>> res, int start, int end)
    {
        if(start>end)
        {
            return;
        }
        
        for(int i=start;i<end;i++)
        {
            
        }
        
    }
}
