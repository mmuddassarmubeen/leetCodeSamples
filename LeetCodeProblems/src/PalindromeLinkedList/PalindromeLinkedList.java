/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalindromeLinkedList;

import ListNode.ListNode;

/**
 *
 * @author Muddassar
 */
public class PalindromeLinkedList {
    
    ListNode start;
    public boolean isPalindrome(ListNode head) {
        start = head;
        return recursePalindrome(head);
    }
    
    private boolean recursePalindrome(ListNode node)
    {
        if(node == null)
        {
            return true;
        }
        boolean result = recursePalindrome(node.next);
        if(node.val == start.val)
        {
            start = start.next;
            return result && true;
        }
        return false;
    }
    
}
