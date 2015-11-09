/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetMatrixZeroes;

/**
 *
 * @author Muddassar
 */
public class SetMatrixZeroes {
    
    public void setZeroes(int[][] matrix) {
        
        
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][0]==0 ||  matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
    
}
