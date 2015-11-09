/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HouseRobberII;

/**
 *
 * @author Muddassar
 */
public class HouseRobberII {
    
    public int rob(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
        return recurseRob(nums, nums.length);
    }
    
    private int recurseRob(int[]nums, int index)
    {
        if(index == 1)
        {
            return nums[0];
        }
        if(index == 2)
        {
            return Math.max(nums[0],nums[1]);
        }
        if(index == 3)
        {
            return Math.max(Math.max(nums[0],nums[1]),nums[2]);
        }
        nums[1] = Math.max(nums[0],nums[1]);
        nums[2] = nums[2] + nums[0];
        for(int i=4;i<index;i++)
        {
                int min = Math.min(nums[i-1],nums[0]);
                nums[i-1] = Math.max(nums[i-1] + nums[i-3]-min,nums[i-2]);   
        }
        return nums[nums.length-1];
    }
}
