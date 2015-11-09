/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class SpiralMatrix {
    
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> result = new ArrayList<>();
        
        if(matrix.length == 0)
        {
            return result;
        }
        int rowmin =0;
        int rowmax = matrix.length-1;
        int colmin =0;
        int colmax = matrix[0].length-1;
        boolean dirRow = true;
        boolean rowRight = true;
        boolean colDown = true;
        
        while(rowmin <= rowmax && colmin <= colmax)
        {
            if(dirRow)
            {
                if(rowRight)
                {
                    for(int i=colmin; i<=colmax;i++)
                    {
                        result.add(matrix[rowmin][i]);
                    }
                    ++rowmin;
                }
                else
                {
                    for(int i=colmax; i>=colmin;i--)
                    {
                        result.add(matrix[rowmax][i]);
                    }
                    --rowmax;
                }
                rowRight = !rowRight;
            }
            else
            {
                if(colDown)
                {
                    for(int i=rowmin; i<=rowmax;i++)
                    {
                        result.add(matrix[i][colmax]);
                    }
                    --colmax;
                }
                else
                {
                    for(int i=rowmax; i>=rowmin;i--)
                    {
                        result.add(matrix[i][colmin]);
                    }
                    ++colmin;
                }
                colDown = !colDown;
            }
            dirRow = !dirRow;
        }
        return result;
    }
    
}
