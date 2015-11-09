/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Combinations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        
        int[] input = new int[n];
        
        for(int r = 0;r<n;r++)
        {
            input[r]=r+1;
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i=1;i<n;i++)
        {
            List<Integer> temp = getArr(input,1,k);
            result.add(temp);
            for(int j=k+1;j<n;j++)
            {
                swap(input,i,j);
                temp = getArr(input,1,k);
                swap(input,i,j);
            }
        }
        return result;
    }
    
    
    private ArrayList<Integer> getArr(int[] arr, int start, int end)
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int l=start;l<=end;l++)
            {
                temp.add(arr[l-1]);
            }
        return temp;
    }
    
    private void swap(int[] arr, int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    
}
