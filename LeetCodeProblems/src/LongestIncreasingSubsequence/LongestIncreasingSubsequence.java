/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongestIncreasingSubsequence;

/**
 *
 * @author Muddassar
 */
public class LongestIncreasingSubsequence {
    
    public int lengthOfLIS(int[] nums) {
        
        if(nums.length==0)
        {
            return 0;
        }
        
        int max = 1;
        for(int i=0;i<nums.length;i++)
        {
            int localmax = 1;
            int current = nums[i];
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]>current)
                {
                    localmax++;
                    current = nums[j];
                }
                max = Math.max(max,localmax);
            }
        }
        return max;
    }
    
}
