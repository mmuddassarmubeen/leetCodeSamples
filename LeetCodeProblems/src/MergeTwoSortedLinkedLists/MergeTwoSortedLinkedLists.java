/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeTwoSortedLinkedLists;

/**
 *
 * @author Muddassar
 */
public class MergeTwoSortedLinkedLists {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode result = null;
        ListNode left = l1;
        ListNode right = l2;
        ListNode itr = null;
        
        while(left !=null && right !=null)
        {
            if(left.val>=right.val)
            {
                if(result == null)
                {
                    result = right;
                    itr = result;
                    right = right.next;
                }
                else
                {
                    itr.next = right;
                    right = right.next;
                    itr = itr.next;
                }
            }
            else
            {
                if(result == null)
                {
                    result = left;
                    itr = result;
                    left = left.next;
                }
                else
                {
                    itr.next = left;
                    left = left.next;
                    itr = itr.next;
                }
                
            }
            
        }
        if(left!=null)
        {
            if(itr == null)
            {
                result = left;
            }
            else
            {
                itr.next = left;
            }
        }
        if(right!=null)
        {
            if(itr == null)
            {
                result = right;
            }
            else
            {
                itr.next = right;
            }
        }
        return result;
    }
}
