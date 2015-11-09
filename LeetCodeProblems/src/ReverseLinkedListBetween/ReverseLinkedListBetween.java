/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseLinkedListBetween;

import ListNode.ListNode;

/**
 *
 * @author Muddassar
 */
public class ReverseLinkedListBetween {
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        if(head.next == null)
        {
            return head;
        }
        ListNode start = head;
        int counter = 1;
        while(counter<m-1)
        {
            start = start.next;        
        }
        ListNode left = start;
        ListNode prev = start;
        ListNode current = start.next;
        ListNode right = current;
        
        while(current.next!=null && counter<n)
        {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        left.next = prev;
        right.next = current;
        return head;
    }
    
    public void print(ListNode n)
    {
        while(n != null)
        {
            System.out.print(n.val);
            n = n.next;
        }
        System.out.println("done");
            
    }
    
}
