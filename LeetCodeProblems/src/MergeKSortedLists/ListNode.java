/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeKSortedLists;

/**
 *
 * @author Muddassar
 */
public class ListNode {
    
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    
    public void print()
    {
        ListNode itr = this;
        while(itr!=null)
        {
            System.out.println(itr.val);
            itr = itr.next;
        }
        
    }
    
    public void initialize(int[] arr)
    {
        ListNode itr = this;
        for(int i: arr)
        {
            itr.next = new ListNode(i);
            itr = itr.next;
        }
    }
}
