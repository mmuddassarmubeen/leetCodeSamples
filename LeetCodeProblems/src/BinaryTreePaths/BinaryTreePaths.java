/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTreePaths;

import TreeNode.TreeNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Muddassar
 */
public class BinaryTreePaths {
    
    public List<String> binaryTreePaths(TreeNode root) {
     
     List<String> res = new ArrayList<String>();
     Stack<TreeNode> st = new Stack<TreeNode>();
     recurse(root, res,st);
     return res;
    }
    
    private void recurse(TreeNode root, List<String> res, Stack<TreeNode> st)
    {
        if(root == null)
        {
            return;
        }
        st.push(root);
        if(root.left == null && root.right == null)
        {
            if(!st.empty())
            {
                
                Iterator<TreeNode> itr = st.iterator();
                String s = String.valueOf(itr.next().val);
                while(itr.hasNext())
                {
                    s += "->" + String.valueOf(itr.next().val);
                }
                res.add(s);
            }
        }
        
        recurse(root.left, res, st);
        recurse(root.right, res, st);
        st.pop();
        
    }
}
