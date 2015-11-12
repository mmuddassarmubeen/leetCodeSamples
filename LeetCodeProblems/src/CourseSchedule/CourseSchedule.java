/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Muddassar
 */
public class CourseSchedule {
    
    
    public boolean findOrder(int numCourses, int[][] prerequisites) 
    { 
        
        if (numCourses == 0 || prerequisites.length == 0) 
        {
            return true;
        }
        
        int[] indegree = new int[numCourses];
        Queue<Integer> tracking = new LinkedList<Integer>();
        int totalCount = 0;
        for(int i=0;i<prerequisites.length;i++)
        {
            indegree[prerequisites[i][0]]++;
        }
        
        for(int j=0;j<indegree.length;j++)
        {
            if(indegree[j]==0)
            {
                tracking.add(j);
            }
        }
        
        totalCount = tracking.size();
        while(!tracking.isEmpty())
        {
            int prereq = tracking.remove();
            for(int k=0;k<prerequisites.length;k++)
            {
                if(prerequisites[k][1]== prereq)
                {
                    indegree[prerequisites[k][0]]--;
                    if(indegree[prerequisites[k][0]]==0)
                    {
                        ++totalCount;
                        tracking.add(prerequisites[k][0]);
                    }
                }
                
            }
        }
        
        return totalCount == numCourses;
    }
}
