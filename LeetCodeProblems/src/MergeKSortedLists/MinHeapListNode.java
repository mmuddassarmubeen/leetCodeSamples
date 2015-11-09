/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeKSortedLists;

import java.util.ArrayList;

/**
 *
 * @author Muddassar
 */
public class MinHeapListNode {
    
    private ArrayList<ListNode>arr;
            
    public MinHeapListNode()
    {
        arr = new ArrayList<ListNode>();
    }
    
    public void add(ListNode node)
    {
        arr.add(node);
        setFromBottom();
    }
    
    private void setFromBottom()
    {
        int index = arr.size()-1;
        ListNode value = arr.get(index);
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
            if(parent >=0 && arr.get(parent).val > value.val)
            {
                swap(arr,index,parent);
            }
            index = parent;
        }
    }
    
    private void setFromTop()
    {
        int index = 0;
        while(index < arr.size())
        {
            int child1 = index*2 +1;
            int child2 = index *2 + 2;
            int comp =0;
            if(child1 < arr.size() && child2<arr.size())
            {
                if(arr.get(child1).val < arr.get(child2).val)
                {
                    comp = child1;
                
                }
                else
                {
                    comp = child2;
                }
            }
            else if(child1 < arr.size())
            {
                comp = child1;
            }
            else
            {
                break;
            }
            if(arr.get(comp).val < arr.get(index).val)
            {
                swap(arr, index, comp);
                index = comp;
                continue;
            }
            break;
            
        }
    }
    
    
    private void swap(ArrayList<ListNode> inp, int first, int second)
    {
        ListNode temp = inp.get(first);
        inp.set(first, inp.get(second));
        inp.set(second, temp);
    }
    
    public ListNode getMin()
    {
        int last = arr.size();
        ListNode result = arr.get(0);
        arr.set(0,arr.get(last-1));
        arr.remove(last-1);
        setFromTop();
        return result;
    }
    
    public boolean isEmpty()
    {
        return arr.size() == 0;
    }
    
    
    
}
