/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymmetricTree;

import TreeNode.TreeNode;

/**
 *
 * @author Muddassar
 */
public class SymmetricTree {
    
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null || (root.left == null && root.right == null))
        {
            return true;
        }
        if((root.left !=null && root.right == null) || (root.left ==null && root.right != null))
        {
            return false;
        }
        
        return checkSymmetry(root.left, root.right);
        
        
    }
    
    private boolean checkSymmetry(TreeNode left, TreeNode right)
    {
        if((left == null && right!=null) || (left!=null && right == null))
        {
            return false;
        }
        if(left.val == right.val)
        {
            return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
        }
        return false;
        
    }
    
}
