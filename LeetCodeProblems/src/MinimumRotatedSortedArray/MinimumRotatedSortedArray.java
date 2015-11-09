/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinimumRotatedSortedArray;

/**
 *
 * @author Muddassar
 */
public class MinimumRotatedSortedArray {
    
    public int findMin(int[] nums) {
        
        return binarySearch(nums,0,nums.length-1);
    }
    
    private int binarySearch(int[]nums, int start, int end)
    {
        if(start == end)
        {
            return nums[start];
        }
        int mid = (start + end)/2;
        if(nums[end]<nums[start])
        {
            return binarySearch(nums,mid,end);
            
        }
        else
        {
            return binarySearch(nums,start,mid);
        }
    }
    
}
