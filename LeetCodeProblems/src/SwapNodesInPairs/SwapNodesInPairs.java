/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwapNodesInPairs;

import ListNode.ListNode;

/**
 *
 * @author Muddassar
 */
public class SwapNodesInPairs {
    
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null)
        {
            return head;
        }
        
        ListNode first = head;
        ListNode second = head.next;
        
        first.next = second.next;
        second.next = first;
        first.next = swapPairs(first.next);
        return second;
        
    }
    
    
    
}
