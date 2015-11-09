/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoveNthNodeFromEndOfList;

import ListNode.ListNode;

/**
 *
 * @author Muddassar
 */
public class RemoveNthNodeFromEnd {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(n==0 || head == null)
        {
            return head;
        }
        
        ListNode first = head;
        for(int i=0;i<n;i++)
        {
            if(first ==null)
            {
                return head;
            }
            first = first.next;
        }
        ListNode second = head;
        
        while(first!=null && first.next!=null)
        {
            first = first.next;
            second = second.next;
        }
        
        if(second.next!=null)
        {
            second.next = second.next.next;
        }
        return head;
    }
    
}
