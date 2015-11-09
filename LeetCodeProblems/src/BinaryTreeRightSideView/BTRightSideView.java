/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class BTRightSideView {
    
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        getRightMost(result, root, 1);
        
        return result;
    }
    
    public void getRightMost(List<Integer> results, TreeNode root, int level)
    {
        if(root!=null)
        {
            if(results.size() < level)
            {
                results.add(root.val);
            }
            else
            {
                results.set(level-1, root.val);
            }
            getRightMost(results, root.left, level+1);
            getRightMost(results, root.right, level+1);
        }
        return;
    }
}
