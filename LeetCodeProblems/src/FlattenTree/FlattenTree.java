/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlattenTree;

/**
 *
 * @author Muddassar
 */
public class FlattenTree {
    
     public void flatten(TreeNode root) {
        recurse(root);
    }
    
    public TreeNode recurse(TreeNode root)
    {
        if(root == null)
        {
            return null;
        }
        if(root.left == null && root.right == null)
        {
            return root;
        }
        TreeNode l = recurse(root.left);
        TreeNode r = recurse(root.right);
        TreeNode c = l;
        if(c!= null)
        {
            while(c.right!=null)
            {
                c = c.right;
            }    
            c.right = r;
            root.right = l;
            root.left = null;
        }
        return root;
    }
    
}
