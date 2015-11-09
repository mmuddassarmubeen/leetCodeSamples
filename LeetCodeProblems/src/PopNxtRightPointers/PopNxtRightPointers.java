/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PopNxtRightPointers;

/**
 *
 * @author Muddassar
 */
public class PopNxtRightPointers {
    
    public void connect(TreeLinkNode root) {
        connect(root.left,root.right);
        connect(root.right,null);
    }
    
    public void connect(TreeLinkNode node, TreeLinkNode right)
    {
       
        if(node ==null)
        {
            return;
        }
        node.next = right;
        connect(node.left,node.right);
        if(right != null)
        {
            connect(node.right,right.left);
        }
        else
        {
            connect(node.right,null);
        }
        
    }
}
