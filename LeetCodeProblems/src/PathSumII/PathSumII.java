/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PathSumII;

import TreeNode.TreeNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Muddassar
 */
public class PathSumII {
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        findPaths(root,st,sum,res);
        return res;
    }
    
    private void findPaths(TreeNode node, Stack<TreeNode> current, int target, List<List<Integer>> res)
    {
        if(node == null)
        {
            return;
        }
        int remaining = target - node.val;
        current.push(node);
        if(node.left == null && node.right == null)
        {
            if(remaining == 0)
            {
                
                if(!current.empty())
                {
                    Iterator<TreeNode> it = current.iterator();
                    List<Integer> path = new ArrayList<Integer>();
                    while(it.hasNext())
                    {
                        path.add(it.next().val);
                    }
                    res.add(path);
                }
            }
        }
        
        findPaths(node.left,current,remaining,res);
        findPaths(node.right,current,remaining,res);
        current.pop();
    }
    
    
}
