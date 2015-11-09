/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NextPermutation;

/**
 *
 * @author Muddassar
 */
public class NextPermutation {
    
    public void nextPermutation(int[] nums) {
        
        if(nums.length <= 1)
        {
            return;
        }
        int index =0;
        for(;index<nums.length;index++)
        {
            if(nums[index]>nums[index+1])
            {
                break;
            }
        }
        for(;index<nums.length;index++)
        {
            
        }
    }
    
}
