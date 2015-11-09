/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterativeInorderTraversal;

import TreeNode.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Muddassar
 */
public class IterativeInorderTraversal {
    
    public List<Integer> inorderTraversal(TreeNode root) {
     Stack<TreeNode> st = new Stack<TreeNode>();
     List<Integer> result = new ArrayList<Integer>();
     
     TreeNode n = root;
     while(!st.empty() || n!=null)
     {
         if(n!=null)
         {
            st.push(n);
            n = n.left;
         }
         else
         {
            TreeNode r = st.pop();
            result.add(r.val);
            n = r.right;
         }
     }
     
     return result;
    }
    
}
