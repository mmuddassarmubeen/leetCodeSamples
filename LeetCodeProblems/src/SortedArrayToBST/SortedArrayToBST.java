/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortedArrayToBST;

import TreeNode.TreeNode;
import com.sun.javafx.scene.control.skin.TextFieldSkin;

/**
 *
 * @author Muddassar
 */
public class SortedArrayToBST {
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums.length ==0)
        {
            return null;
        }
        return buildBST(nums, 0, nums.length-1);
    }
    
    private TreeNode buildBST(int[] nums, int start, int end)
    {
        if(start>end)
        {
            return null;
        }
        if(start == end)
        {
            return new TreeNode(nums[start]);
        }
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildBST(nums, start, mid-1);
        node.right = buildBST(nums, mid+1, end);
        return node;
    }
    
}
