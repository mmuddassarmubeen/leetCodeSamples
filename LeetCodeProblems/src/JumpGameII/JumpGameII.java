/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JumpGameII;

/**
 *
 * @author Muddassar
 */
public class JumpGameII {
    
    public int jump(int[] nums) {
        
        int currentFarthest = 0;
        int currEnd = 0;
        int jumps = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            currentFarthest = Math.max(nums[i]+i,currentFarthest);
            if(currEnd == i)
            {
                ++jumps;
                currEnd = currentFarthest;
            }
        }
        return jumps;
    }
}
