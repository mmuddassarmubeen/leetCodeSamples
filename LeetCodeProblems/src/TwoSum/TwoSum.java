/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) 
    {
        int[] result = new int[2];
        HashMap<Integer,List<Integer>> map = new HashMap();
        for(int i =0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                List<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                map.put(nums[i], indexes);
            }
            else
            {
                ((ArrayList<Integer>)map.get(nums[i])).add(i);
            }
        }
        
        boolean found = false;
        for(int j =0;j <nums.length;j++)
        {
            int find = target-nums[j];
            if(!found && map.containsKey(find))
            {
                ArrayList<Integer> indexes = (ArrayList<Integer>) map.get(find);
                for(int l =0; l<indexes.size() ;l++)
                {
                    if(indexes.get(l)!=j)
                    {
                        result[0] = j+1;
                        result[1] = indexes.get(l) + 1;
                        found = true;
                        break;
                    }
                }
            }
        }
        
        return result;
    }
}
