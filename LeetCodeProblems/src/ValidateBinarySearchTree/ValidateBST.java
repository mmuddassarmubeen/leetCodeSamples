/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidateBinarySearchTree;

import java.util.Stack;

/**
 *
 * @author Muddassar
 */
public class ValidateBST {
    
    public boolean isValidBST(TreeNode root) {
       
        return validBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean validBST(TreeNode root, int min, int max)
    {
        if(root == null)
        {
            return true;
        }
        boolean left = false;
        boolean right = false;
        if(root.val>= min && root.val<= max)
        {
            left = validBST(root.left,min,root.val);
            right = validBST(root.right,root.val,max);
        }
        return left && right;
    }
}
