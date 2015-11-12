/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PermutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class PermutationsII {
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrack(nums,0,nums.length-1,result);
        return result;
    }
    
    private void backtrack(int[] nums, int start, int end, List<List<Integer>> res)
    {
        if(start == end)
        {
            ArrayList<Integer> r = new ArrayList<Integer>();
            for(int i: nums)
            {
                r.add(i);
            }
            res.add(r);
            return;
        }
        
        
        for(int i=start;i<=end;i++)
        {
            if(start==i || nums[start]!=nums[i])
            {
                swap(nums,start,i);
                backtrack(nums,start+1,end,res);
                swap(nums,start,i);
            }
             
            if(start==i || nums[start]!=nums[i])
            {
                
            }
        }
    }
    
    private void swap(int[] nums, int index1, int index2)
    {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
