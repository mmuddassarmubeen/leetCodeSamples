/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntersectionOfLinkedLists;

import ListNode.ListNode;

/**
 *
 * @author Muddassar
 */
public class IntersectionOfLinkedLists {
    
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null)
        {
            return null;
        }
        ListNode first = headA;
        ListNode second = headB;
        ListNode res = null;
        while(first.next!=null && second.next !=null)
        {
            first = first.next;
            second = second.next;
        }
        if(first.next == null)
        {
            first.next = headA;
            int count = 0;
            while(second!=headA)
            {
                second = second.next;
                if(second == null)
                {
                    return null;
                }
                count++;
            }
            first.next = null;
            
            res = headB;
            while(count>=0)
            {
                res = res.next;
                count--;
            }
        }
        if(second.next == null)
        {
            second.next = headB;
            int count = 0;
            while(first!=headB)
            {
                first = first.next;
                if(first == null)
                {
                    return null;
                }
                count++;
            }
            second.next = null;
            
            res = headA;
            while(count>0)
            {
                res = res.next;
                count--;
            }
        }
        return res;
    }
    
}
