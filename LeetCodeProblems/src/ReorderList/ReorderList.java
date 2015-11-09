/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReorderList;

/**
 *
 * @author Muddassar
 */
public class ReorderList {
    
     public void reorderList(ListNode head) {
        
        ListNode first = head;
        ListNode second = head;
        
        while(first!=null && first.next!=null)
        {
            first = first.next.next;
            if(first!=null)
            {
                second = second.next;
            }
        }
        ListNode revLN = second.next;
        second.next = null;
        ListNode rev = reverse(revLN);
        ListNode itr1 = head;
        ListNode itr2 = rev;
        while(itr1!=null && itr2!=null)
        {
            ListNode temp = itr1.next;
            ListNode temp1 = itr2;
            itr2 = itr2.next;
            itr1.next = temp1;
            temp1.next = temp;
            itr1 = itr1.next.next;
        }
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode current = head;
        
        while(current != null)
        {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    
}
