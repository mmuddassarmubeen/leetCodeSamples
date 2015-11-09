/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RotateList;

/**
 *
 * @author Muddassar
 */
public class RotateList {
    
    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode firstElement = head;
        ListNode kthElement = null;
        ListNode result = null;
        
        if(head == null)
        {
            return result;
        }
        int length = 0;
        for(int i=1;i<=k;i++)
        {
            if(firstElement == null)
            {
                k = k%length;
                i = 0;
                firstElement = head;
            }
            else
            {
                firstElement = firstElement.next;
                ++length;
            }
        }
        kthElement = head;
        
        while(firstElement != null && firstElement.next !=null)
        {
            firstElement = firstElement.next;
            kthElement = kthElement.next;
        }
        if(firstElement != null)
        {
            firstElement.next = head;
            result = kthElement.next;
            kthElement.next = null;
        }
        else
        {
            result = kthElement;
        }
        
        return result;
        
    }
    
}
