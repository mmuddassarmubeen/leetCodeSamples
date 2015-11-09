/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortedListToBST;

import ListNode.ListNode;
import TreeNode.TreeNode;

/**
 *
 * @author Muddassar
 */
public class SortedListToBST {
    
    public TreeNode sortedListToBST(ListNode head) {
        return recurse(head, null);
    }
    
    private TreeNode recurse(ListNode head, ListNode end)
    {
        if(head == end)
        {
            return null;
        }
        ListNode middle = head;
        ListNode twoSkip = head;
        
        while(twoSkip != null && twoSkip!=end)
        {
            
            if(twoSkip.next != null)
            {
                twoSkip = twoSkip.next.next;
            }
            else
            {
                break;
            }
            middle = middle.next;
        }
        
        ListNode temp = middle.next;
        middle.next = null;
        
        
        TreeNode root = new TreeNode(middle.val);
        
        root.left = recurse(head,middle);
        root.right = recurse(temp,null);
        return root;
    }
    
}
