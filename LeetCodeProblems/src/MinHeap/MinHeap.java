/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinHeap;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Muddassar
 */
public class MinHeap {
    
    private ArrayList<Integer>arr;
            
    public MinHeap(int size)
    {
        arr = new ArrayList<Integer>();
    }
    
    public void add(int value)
    {
        arr.add(value);
        setFromBottom();
    }
    
    private void setFromBottom()
    {
        int index = arr.size()-1;
        int value = arr.get(index);
        while(index>0)
        {
            int parent = -1;
            if(index %2 == 0)
            {
                parent = index/2 -1;
            }
            else
            {
                parent = index/2;
            }
            if(parent >=0 && arr.get(parent) > value)
            {
                swap(arr,index,parent);
            }
            index = parent;
        }
    }
    
    public void setFromTop()
    {
        int index = 0;
        while(index < arr.size())
        {
            int child1 = index*2 +1;
            int child2 = index *2 + 2;
            if(arr.get(child1)< arr.get(index))
            {
                swap(arr, index, child1);
            }
            else if(arr.get(child2)< arr.get(index))
            {
                swap(arr, index, child2);
            }
            else
            {
                break;
            }
        }
    }
    
    
    private void swap(ArrayList<Integer> inp, int first, int second)
    {
        int temp = inp.get(first);
        inp.set(first, inp.get(second));
        inp.set(second, temp);
    }
    
    public int getMin()
    {
        int last = arr.size();
        int result = arr.get(0);
        arr.set(0,arr.get(last-1));
        setFromTop();
        return result;
    }
    
    public void print()
    {
        for(int i : arr)
        {
            System.out.println(i);
        }
    }
}
