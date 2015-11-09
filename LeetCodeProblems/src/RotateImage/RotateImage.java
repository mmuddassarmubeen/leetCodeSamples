/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RotateImage;

/**
 *
 * @author Muddassar
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        int min = 0;
        int max = columns;
        for(int i = 0; i<rows/2 ;i++)
        {
            for(int j=min; j<max-1;j++)
            {
                int temp = matrix[j][max-1];
                matrix[j][max-1] = matrix[min][j];
                matrix[min][j] = matrix[max-1-j][min];
                matrix[max-1-j][min] = matrix[max-1][max-1-j];
                matrix[max-1][max-1-j] = temp;
                
            }
            ++min;
            --max;
        }
        
    }
}
