/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KTermsReversal;

/**
 *
 * @author Muddassar
 */
public class KTermsReversal {
    
    public ListNode reverseKGroup(ListNode head, int k) {
     
        if(head == null)
        {
            return null;
        }
        int count = 0;
        ListNode trunk = null;
        ListNode start = head;
        ListNode end = start;
        ListNode tail = null;
        while(end!=null)
        {
            while(count<k-1 && end!=null)
            {
                end = end.next;
                if(end!=null)
                {
                    ++count;
                }
            }
            if(count != k-1)
            {
                break;
            }
            tail = end.next;
            ListNode revRes = reverse(start,end);
            
            if(trunk!=null)
            {
                trunk.next = revRes;
            }
            else
            {
                head = revRes;
            }
            trunk = start;
            start = tail;
            end = tail;
            count = 0;
        }
        if(tail!=null)
        {
            trunk.next = tail;
        }
        return head;
        
    }
    
    private ListNode reverse(ListNode start, ListNode end)
    {
        ListNode temp = end.next;
        ListNode revPrev = null;
        ListNode revCurrent = start;
        
        while(revCurrent != temp)
        {
            ListNode revTemp = revCurrent.next;
            revCurrent.next = revPrev;
            revPrev = revCurrent;
            revCurrent = revTemp;
        }
        return revPrev;
        
    }
    
}
