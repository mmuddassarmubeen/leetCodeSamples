/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RotateArray;

/**
 *
 * @author Muddassar
 */
public class RotateArray {
    
    public void rotate(int[] nums, int k) {
        
        if (nums.length == 0 || nums.length == 1)
        {
            return;
        }
        
        if(k>1)
        {
            k = nums.length%k;
        }
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
        
        for(int i=0;i<k && i< nums.length-i-1;i++)
        {
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        if(k<nums.length-k-1)
        {
            swap(nums,k,nums.length-k-1);
        }
        
    }
    
    private void swap(int[] nums, int start, int end)
    {
        while(start <end)   
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
