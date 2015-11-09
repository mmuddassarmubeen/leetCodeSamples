/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListNode;

/**
 *
 * @author Muddassar
 */
public class ListNode {
    
     public int val;
      public ListNode next;
      public ListNode(int x) { val = x; }
      
      public void initialize(int[] arr)
      {
          ListNode n = this;
          for(int i: arr)
          {
              n.next = new ListNode(i);
              n = n.next;
          }
      }
      
      public void print()
      {
          ListNode n = this;
          while(n!=null)
          {
              System.out.print(n.val + "->");
              n = n.next;
          }
          System.out.print("null");
          System.out.println("");
      }
}
