/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterativePreOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Muddassar
 */
public class IterativeBinaryTreePreOrder {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<>();
        stk.add(root);
        
        while(!stk.empty())
        {
            TreeNode n = stk.pop();
            if(n!=null)
            {
                result.add(n.val);
                stk.push(n.right);
                stk.push(n.left);
            }
        }
        return result;
        
    }
    
}
