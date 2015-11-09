/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaximumProductSubarray;

/**
 *
 * @author Muddassar
 */
public class MaximumProductSubarray {
    
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int local = nums[0];
        for(int i=1;i<nums.length;i++)
        {
              local = nums[i];
              if(nums[i]>local)
              {
                  
              }
              if(max<local)
              {
                  max = local;
              }
              else
              {
                  local = 1;
              }
        }
        return max;
    }
}
