/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HouseRobber;

/**
 *
 * @author Muddassar
 */
public class HouseRobber {
    
    public int rob(int[] nums) {

        if(nums.length == 0)
        {
            return 0;
        }
        return dpRob(nums,nums.length);
    }
    
    private int dpRob(int[] nums, int index)
    {
        if(index == 1)
        {
            return nums[index-1];
        }
        if(index == 2)
        {
            return Math.max(nums[0], nums[1]);
        }        
        nums[1] = Math.max(nums[0], nums[1]);
        for(int i =3;i<=index;i++)
        {
            int includeCurrent = nums[i-1] + nums[i-3];
            nums[i-1] = Math.max(includeCurrent, nums[i-2]);
        }
        return nums[nums.length -1];
    }
    
    /*public int rob(int[] num) {

        if(num.length==0) return 0;
    if(num.length==1) return num[0];
    num[1] = Math.max(num[0], num[1]);
    for(int i=2;i<num.length;i++) 
    {
        num[i] = Math.max(num[i]+num[i-2], num[i-1]);
    }
    return num[num.length-1];
    }*/
    
    
    
}
