/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseScheduleII;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Muddassar
 */
public class CourseScheduleII {
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    
        if(numCourses == 0)
        {
            return new int[0];
        }
        int[] indegree = new int[numCourses];
        int[] order = new int[numCourses];
        int index=0;
        Queue<Integer> independentCourses = new LinkedList<Integer>();
        
        for(int i =0;i< prerequisites.length;i++)
        {
            indegree[prerequisites[i][0]]++;
        }
        
        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
                independentCourses.add(i);
            }
        }
        
        while(!independentCourses.isEmpty())
        {
            int independentCourse = independentCourses.remove();
            order[index] = independentCourse;
            index++;
            for(int j=0;j<prerequisites.length;j++)
            {
                if(prerequisites[j][1]==independentCourse)
                {
                    indegree[prerequisites[j][0]]--;
                    if(indegree[prerequisites[j][0]] ==0)
                    {
                         independentCourses.add(prerequisites[j][0]);   
                    }
                }
            }
        }
        
        if(index == numCourses)
        {
            return order;
        }
        return new int[0];
        
    }
}
