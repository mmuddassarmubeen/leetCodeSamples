/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddTwoLinkedLists;

/**
 *
 * @author Muddassar
 */
public class AddTwoLinkedLists {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null)
        {
            return l2;
        }
        
        if(l2 == null)
        {
            return l1;
        }
        
        int carryover = 0;
        
        ListNode first = l1;
        ListNode second = l2;
        ListNode result = null;
        ListNode resPointer = null;
        
        while(first!= null && second!=null)
        {
            int res = first.val + second.val + carryover;
            if(res>=10)
            {
                carryover = 1;
            }
            else
            {
                carryover = 0;
            }
            if(result == null)
            {
                result = new ListNode(res%10);
                resPointer = result;
            }
            else
            {
                resPointer.next = new ListNode(res%10);
                resPointer = resPointer.next;
            }
            first = first.next;
            second = second.next;
        }
        
        if(first!=null)
        {
            while(first!=null)
            {
            int newres = first.val + carryover;
            if(newres>=10)
            {
                carryover = 1;
            }
            else
            {
                carryover = 0;
            }
            resPointer.next = new ListNode(newres);
            first = first.next;
            resPointer = resPointer.next;
            }
        }
        
        if(second!=null)
        {
            while(second!=null)
            {
            int newres = second.val + carryover;
            if(newres>=10)
            {
                carryover = 1;
            }
            else
            {
                carryover = 0;
            }
            resPointer.next = new ListNode(newres%10);
            second = second.next;
            resPointer = resPointer.next;
            }
        }
        if(carryover == 1)
        {
            resPointer.next = new ListNode(carryover);
        }
        return result;
    }
    
}
