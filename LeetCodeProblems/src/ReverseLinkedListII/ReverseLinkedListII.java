/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseLinkedListII;

/**
 *
 * @author Muddassar
 */
public class ReverseLinkedListII {
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        if(head.next == null)
        {
            return head;
        }
        ListNode node = head;
        int i = 1;
        while(i<m-1)
        {
            node = node.next;
            i++;
        }
        
        ListNode tempEnd = node;
        ListNode revHead = node.next;
        
        ListNode revPrev = null;
        ListNode revCurrent = revHead;
        
        ListNode tempStart = null;
        ListNode tempMiddle = null;
        
        if(m==1)
        {
            tempEnd = null;
            revHead = node;
            revCurrent = revHead;
        }
        
        
        while(i<=n)
        {   
            ListNode temp = revCurrent.next;
            
            revCurrent.next = revPrev;
            revPrev = revCurrent;
            revCurrent = temp;
            i++;
            if(i > n)
            {
                tempMiddle = revPrev;
                tempStart = revCurrent;
            }
        }
        if(m == 1)
        {
            revHead.next = tempStart;
            return tempMiddle;
        }
        else
        {
            node.next = tempMiddle;
            revHead.next = tempStart;
        }
        
        
        return node;
        
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
