/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvertBinaryTree;

/**
 *
 * @author Muddassar
 */
public class InvertBinaryTree {
    
    public TreeNode invertTree(TreeNode root) {
        
        TreeNode node = root;
        if(node == null)
        {
            return null;
        }
        if(node.left == null && node.right == null)
        {
            return node;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;
        node.left = invertTree(right);
        node.right = invertTree(left);
        return node;
    }
    
}
