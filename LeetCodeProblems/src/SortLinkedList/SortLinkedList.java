/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortLinkedList;

/**
 *
 * @author Muddassar
 */
public class SortLinkedList {
    
    public ListNode sortList(ListNode head) {
        
        if(head == null)
        {
            return null;
        }
        quickSort(head, null);
        return head;
    }
    
    public void quickSort(ListNode head, ListNode tail)
    {
        if(head == null || head.next == null || head == tail)
        {
            return;
        }
        ListNode pivot = head;
        ListNode current = head.next;
        ListNode prev = head;
        while(current != null && current != tail)
        {
            if(current.val>=pivot.val)
            {
                current = current.next;
                prev = prev.next;
            }
            else
            {
                ListNode temp = current.next;
                prev.next = temp;
                current.next = head;
                head = current;
                current = temp;
            }
        }
        
        ListNode left = head;
        ListNode pi = pivot;
        ListNode rt = pi.next;
        tail = prev;
        //ListNode l = 
        quickSort(left,pi);
        //ListNode r = 
        quickSort(rt,tail);
        /*if(l!=null && r!=null)
        {
            l.next = r;
        }
        return l;*/
    }
}
