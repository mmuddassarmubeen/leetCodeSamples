/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HIndex;

/**
 *
 * @author Muddassar
 */
public class HIndex {
    
    public int hIndex(int[] citations) {
        
        int hindex = citations.length;
        int[] arr = new int[citations.length+1];
        int n = citations.length;
        for(int i = citations.length-1;i>=0;i--)
        {
            if(citations[i]>=n)
            {
                arr[n]++;
            }
            else
            {
                arr[citations[i]]++;
            }
        }
        
        int sum = 0;
        for(int j =arr.length;j>=0;j--)
        {
            sum += arr[j];
            if(sum>arr[j])
            {
                return j;
            }
        }
        return hindex;
    }
    
}
