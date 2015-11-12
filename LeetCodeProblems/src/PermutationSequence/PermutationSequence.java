/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PermutationSequence;

/**
 *
 * @author Muddassar
 */
public class PermutationSequence {
    
    public String getPermutation(int n, int k) {
        
        double factorial = 1;
        int i = 1;
        for(;i<10 && factorial*i<k;i++)
        {
            factorial *=i;
        }
        
        double times = k/factorial;
        double startInteger = times +1;
        double rem = k%factorial;
        int remaining =  Double.valueOf(rem).intValue();
        int[] inp = new int[8];
        for(int j = 0;j<10;j++)
        {
            if(j<startInteger)
            {
                inp[j] = j+1;
            }
            else if(j>startInteger)
            {
                inp[j-1] = j;
            }
        }
        
        return String.valueOf(startInteger) + permutation(inp, remaining);
    }
    
    private String permutation(int[] arr, int k)
    {
        double factorial = 1;
        int i = 1;
        for(;i<arr[arr.length-1] && factorial*i<k;i++)
        {
            factorial *=i;
        }
        
        double times = k/factorial;
        double startInteger = times +1;
        double remaining = k%factorial;
        int[] inp = new int[8];
        
        return null;
    }
}
