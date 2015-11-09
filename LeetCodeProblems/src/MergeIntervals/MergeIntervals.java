/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeIntervals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class MergeIntervals {
    
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if(intervals.size()==0)
        {
            return result;
        }
        result.add(intervals.get(0));
        for(int i =1;i<intervals.size();i++)
        {   
            if(overlappingIntervals(intervals.get(i), intervals.get(i-1)))
            {
                result.get(result.size()-1).end = Math.max(intervals.get(i).end,result.get(result.size()-1).end);
                result.get(result.size()-1).start = Math.min(intervals.get(i).start,result.get(result.size()-1).start);
            }
            else
            {
                result.add(intervals.get(i));
            }
        }
        return result;
    }
    
    private boolean overlappingIntervals(Interval i1, Interval i2)
    {
        if(i1.start<=i2.start && i2.start<=i1.end)
        {
            return true;
        }
        if(i2.start<=i1.start && i1.start<=i2.end)
        {
            return true;
        }
        return false;
    }
    
}
