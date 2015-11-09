/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PathSum;

import TreeNode.TreeNode;

/**
 *
 * @author Muddassar
 */
public class PathSum {
    
    public boolean hasPathSum(TreeNode root, int sum) {
        
        return recurse(root, sum, 0);
    }
    
    private boolean recurse(TreeNode root, int sum, int current)
    {
        if(root == null)
        {
            if(current == sum)
            {
                return true;
            }
            return false;
        }
        
        current += root.val;
        boolean left = false;
        if(root.left!=null)
        {
            left = recurse(root.left,sum,current);
        }
        boolean right = false;
        if(root.right!=null)
        {
            right = recurse(root.right,sum,current);
        }
        if(root.left == null && root.right == null)
        {
            return current == sum;
        }
        current -= root.val;
        return left || right;
    }
}
