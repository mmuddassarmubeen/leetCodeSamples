/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BacktrackStringPermutation;

/**
 *
 * @author Muddassar
 */
public class BacktrackStringPermutation {
    
    public void backtrackStringPermute(String s)
    {
        permute(s.toCharArray(),0,s.length()-1);
    }
    
    private void permute(char[] arr, int start, int last)
    {
        if(start == last)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j]);
            }
            System.out.println();
            return;
        }
        for(int i=start;i<=last;i++)
        {
            swap(arr,start,i);
            permute(arr, start+1,last);
            swap(arr,start,i);
            
        }
    }
    
    private void swap(char[] arr, int left, int right)
    {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
