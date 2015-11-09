/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTZigZagLevelOT;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Muddassar
 */
public class BTZigZagLevelOT {
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        List<List<Integer>> result = new ArrayList<List<Integer>>(); 
        Stack<TreeNode> leftStack = new Stack<TreeNode>();
        Stack<TreeNode> rightStack = new Stack<TreeNode>();
        boolean fromLeft = true;
        if(root!=null)
        {
            leftStack.push(root);
        }
        while(!leftStack.empty() || !rightStack.empty())
        {
            if(fromLeft)
            {
                List<Integer> level = new ArrayList<Integer>();;
                while(!leftStack.empty())
                {
                    TreeNode n = leftStack.pop();
                    if(n!=null)
                    {
                        if(n.left!=null)
                        {
                            rightStack.push(n.left);
                        }
                        if(n.right!=null)
                        {
                            rightStack.push(n.right);
                        }
                        level.add(n.val);
                    }
                }
                if(level.size()!=0)
                {
                    result.add(level);
                }
            }
            else
            {
                List<Integer> level = new ArrayList<Integer>();
                while(!rightStack.empty())
                {
                    TreeNode n = rightStack.pop();
                    if(n!=null)
                    {
                        if(n.right!=null)
                        {
                            leftStack.push(n.right);
                        }
                        if(n.left!=null)
                        {
                            leftStack.push(n.left);
                        }
                        level.add(n.val);
                    }
                    
                }
                if(level.size()!=0)
                {
                    result.add(level);
                }
            }
            fromLeft = !fromLeft;
            
        }
       return result; 
    }
    
}
