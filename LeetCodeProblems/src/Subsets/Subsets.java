/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class Subsets {
    
    public List<List<Integer>> subsets(int[] nums) {
        
        Arrays.sort(nums);
        return backtrack(nums, nums.length-1);
    }
    
    private List<List<Integer>> backtrack(int[] nums, int start)
    {
        if(start<0)
        {
            List<List<Integer>> empty = new ArrayList<List<Integer>>();
            empty.add(new ArrayList<Integer>());
            return empty;
        }
        List<List<Integer>> basecase = null;
        for(int i=start;i>=0;i--)
        {
            basecase = backtrack(nums,start-1);
            List<List<Integer>> included = new ArrayList<List<Integer>>();
            for(List<Integer> l : basecase)
            {
                ArrayList<Integer> newList = new ArrayList<Integer>(l);
                newList.add(nums[i]);
                included.add(newList);
            }
            basecase.addAll(included);
            return basecase;
            
        }
        return basecase;
    }
}
