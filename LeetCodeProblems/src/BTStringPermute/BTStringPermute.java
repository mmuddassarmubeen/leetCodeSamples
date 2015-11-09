/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTStringPermute;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class BTStringPermute {
    
    public List<List<Integer>> permute(int[] nums) {
        if(nums == null || nums.length ==0)
        {return null;}
     List<List<Integer>> results = new ArrayList<List<Integer>>();
     allPermutations(nums,0,nums.length-1,results);
     return results;
    }
    
    private void allPermutations(int[]nums, int start, int end, List<List<Integer>> res)
    {
        
        if(start == end)
        {
            ArrayList<Integer> r = new ArrayList<Integer>();
            for(int i : nums)
            {
                r.add(i);
            }
            res.add(r);
            return;
        }
        
        
            for(int i=start;i<=end;i++)
            {
                swap(nums,start,i);
                allPermutations(nums,start+1,end,res);
                swap(nums,start,i);
            }
            
        
        
    }
    
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
    
}
