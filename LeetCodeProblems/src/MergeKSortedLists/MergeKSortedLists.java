/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeKSortedLists;

/**
 *
 * @author Muddassar
 */
public class MergeKSortedLists {
    
    public ListNode mergeKLists(ListNode[] lists) {
        MinHeapListNode mh = new MinHeapListNode();
        ListNode result = null;
        ListNode itr = null;
        
        for(ListNode ln : lists)
        {
            ListNode head = ln;
            if(head != null)
            {
                mh.add(head);
            }
        }
        
        while(!mh.isEmpty())
        {
            ListNode node = mh.getMin();
            if(node.next !=null)
            {
                mh.add(node.next);
            }
            ListNode n = new ListNode(node.val);
            if(result == null)
            {
                result = n;
                itr = result;
            }
            
            else
            {
                
                itr.next = n;
                itr = itr.next;
            }
        }
        return result;
    }
}
