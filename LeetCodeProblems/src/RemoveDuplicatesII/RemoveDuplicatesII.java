/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoveDuplicatesII;

/**
 *
 * @author Muddassar
 */
public class RemoveDuplicatesII {
    
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0)
        {
            return 0;
        }
        int current = nums[0];
        int start = 0;
        int end = 0;
        int headPointer = 0;
        int count = 0;
        while(start<nums.length && end<nums.length)
        {
            while(end<nums.length && nums[end] == current)
            {
                end++;
            }
            nums[headPointer] = nums[start];
            headPointer = headPointer+1;
            
            if(end-start>=2)
            {
                if(headPointer<nums.length-1)
                {
                    nums[headPointer+1] = nums[start];
                    headPointer = headPointer+1;
                }
            }
            start = end;
            if(end<nums.length)
            {
                current = nums[end];
            }
            count++;
        }
        return count;
    }
    
}
