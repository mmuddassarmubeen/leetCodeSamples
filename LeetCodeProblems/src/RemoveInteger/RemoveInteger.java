/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoveInteger;

/**
 *
 * @author Muddassar
 */
public class RemoveInteger {
    
    public int removeElement(int[] nums, int val) {
        
        int i = 0;
        int j = nums.length-1;
        
        while(i<=j)
        {
            while(nums[j]==val)
            {
                j--;
                if(j<0)
                {
                    nums = new int[nums.length];
                    return 0;
                }
            }
            while(nums[i]!=val)
            {
                i++;
                if(i>nums.length-1)
                {
                    return nums.length;
                }
            }
            
            nums[i] = nums[j];
            i++;
            j--;
            
        }
        return j+1;
        
        
    }
    
}
