/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KthHighestNumber;

/**
 *
 * @author Muddassar
 */
public class KthHighestNumber {
    
    public int findKthLargest(int[] nums, int k) {
        
        int start = 0;
        int pivot = nums.length-1;
        
        do
        {
            while(start < pivot)
            {
                if(nums[start] <= nums[pivot])
                {
                    start++;
                    continue;
                }
                else
                {
                    swap(nums, start, pivot-1);
                    swap(nums, pivot-1,pivot);
                    pivot = pivot-1;
                }
            }
            if(pivot!=nums.length-k)
            {
                if(pivot < nums.length - k)
                {
                    start = pivot;
                    pivot = nums.length-1;

                }
                else
                {
                    start = 0;
                    pivot = pivot-1;
                }
                continue;
            }
            else
            {
                break;
            }
        }while(true);
        return nums[pivot];
    }
    
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
