/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchForRange;

/**
 *
 * @author Muddassar
 */
public class SearchForRange {
    public int[] searchRange(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;
        return search(nums,target,start,end);
    }
    
    public int[] search(int[] nums, int target, int start, int end)
    {
        int left = 0;
        int right = 0;
        int mid =  Math.floorDiv(start + end, 2);
        if(nums[mid] == target)
        {
            return searchValue(nums, mid);
        }
        if(nums[mid]<target)
        {
            left = mid+1;
            right = end;
            if(left<=right)
            {
                return search(nums,target,left,right);
            }
            else
            {
                return new int[]{-1,-1};
            }
        }
        else
        {
            left = 0;
            right = mid-1;
            if(left<=right)
            {
                return search(nums,target,left,right);
            }
            else
            {
                return new int[]{-1,-1};
            }
        }
    }
    
    public int[] searchValue(int[] nums, int index)
    {
        int left = index;
        int right = index;
        for(int i= index-1;i>=0;i--)
        {
            if(nums[i]==nums[index])
            {
                --left;
            }
        }
        for(int i= index+1;i<=nums.length-1;i++)
        {
            if(nums[i]==nums[index])
            {
                ++right;
            }
        }
        return new int[]{left,right};
    }
}
