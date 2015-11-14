/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortColors;

/**
 *
 * @author Muddassar
 */
public class SortColors {
    
    public void sortColors(int[] nums) {
        
        int whiteCount = 0;
        int i = 0;
        int j = nums.length-1;
        
        while(i<=j)
        {
            while(nums[i]==0)
            {
                i++;
            }
            while(nums[j]==2)
            {
                j--;
            }
            if(nums[i]==2)
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            }
            if(nums[j]==0)
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            if(nums[i]==1)
            {
                whiteCount++;
                nums[i]=0;
                i++;
            }
            if(nums[j]==1)
            {
                whiteCount++;
                nums[j]=0;
            }
        }
        
        for(int k = 0;k<whiteCount;k++)
        {
            nums[i-k] = 1;
        }
        
    }
}
