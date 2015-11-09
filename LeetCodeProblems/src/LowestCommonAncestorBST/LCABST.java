/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LowestCommonAncestorBST;

import TreeNode.TreeNode;
import java.util.Stack;

/**
 *
 * @author Muddassar
 */
public class LCABST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null)
        {
            return null;
        }
        dfs(root, p);
        return root;
    }
    
    public boolean dfs(TreeNode root, TreeNode target)
    {
        
        if(root == null)
        {
            return false;
        }
        if(root.val == target.val)
        {
            return true;
        }
        return dfs(root.left, target) || dfs(root.right,target);
    }
}
