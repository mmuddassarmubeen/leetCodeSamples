/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MajorityElement;

/**
 *
 * @author Muddassar
 */
public class MajorityElement {
    
    public int majorityElement(int[] nums) {
     
        int count = 0;
        int current = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == current)
            {
                count++;
            }
            else
            {
                if(count == 0)
                {
                    current = nums[i];
                }
                else
                {
                    count--;
                }
            }
        }
        return current;
    }
    
}
