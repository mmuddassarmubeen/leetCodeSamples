/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSortList;

/**
 *
 * @author Muddassar
 */
public class InsertionSortList {
    
    public ListNode insertionSortList(ListNode head) {
        
        if(head == null)
        {
            return null;
        }
        
        ListNode prev = null;
        ListNode current = head;
        ListNode comparer = head;
        ListNode comparerPrev = null;
        boolean modified = false;
        
        while(current!=null)
        {
            while(comparer != current)
            {
                if(current.val<comparer.val)
                {
                    prev.next = current.next;
                    if(comparerPrev == null)
                    {
                        ListNode n = new ListNode(current.val);
                        n.next = head;
                        head = n;
                        
                    }
                    else
                    {
                        ListNode temp = comparerPrev.next;
                        comparerPrev.next = current;
                        current.next = temp;
                    }
                    prev = prev;
                    current = prev.next;
                    modified = true;
                    break;
                    
                }
                else
                {
                    comparerPrev = comparer;
                    comparer = comparer.next;
                }
            }
            
            if(!modified)
            {
                prev = current;
                current = current.next;
            }
            modified = false;
            comparerPrev = null;
            comparer = head;
        }
        
        return head;
    }
    
}
