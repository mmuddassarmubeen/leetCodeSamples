/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candy;

/**
 *
 * @author Muddassar
 */
public class Candy {
    
    public int candy(int[] ratings) {
        
        //int currentValue = ratings[0];
        int currentIndex = 0;
        int candy = 0;
        int startIndex = 0;
        int prevCandy = 0;
        int newCandy = 0;
        for(int i=1;i<ratings.length;i++)
        {
            boolean higherInflection = ratings[i]>ratings[i-1]&& ( i<ratings.length-1? ratings[i]>ratings[i+1]:true);
            boolean lowerInflection = ratings[i]<ratings[i-1] && (i<ratings.length-1? ratings[i]<ratings[i+1]:true);
            if(higherInflection || lowerInflection) 
            {
                newCandy = (i-startIndex+1)*(i-startIndex+2)/2;
                
                if(startIndex>0 && ratings[startIndex-1]>ratings[startIndex] && newCandy>=prevCandy && ratings[currentIndex]<ratings[startIndex-1])
                {
                    candy+=newCandy-prevCandy +1;
                }
                candy+= newCandy;
                prevCandy = newCandy;
                startIndex = i+1;
            }
            currentIndex = i;
        }
        /*if(startIndex>0 && ratings[startIndex-1]>ratings[startIndex] && newCandy>prevCandy && ratings[ratings.length-1]<ratings[startIndex])
        {
                    candy+=newCandy-prevCandy +1;
        }*/
        candy+=(currentIndex-startIndex)*(currentIndex-startIndex+1)/2;
        
        
        return candy;
        
    }
    
}
