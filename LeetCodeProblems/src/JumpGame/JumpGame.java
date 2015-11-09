/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JumpGame;

/**
 *
 * @author Muddassar
 */
public class JumpGame {
 
    public boolean canJump(int[] nums) {
        int target = nums.length -1;
        int search = nums.length -2;
        while(search>=0)
        {
            if(search + nums[search]>=target)
            {
                target = search;
                search = target-1;
            }
            else
            {
                search = search -1;    
            }
        }
        if(target == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
}
