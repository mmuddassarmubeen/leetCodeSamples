/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildTreeFromInPostOrders;

import TreeNode.TreeNode;

/**
 *
 * @author Muddassar
 */
public class BuildTreeFromInPostOrders {
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        return recurseBuildTree(inorder, postorder,0,inorder.length-1,0,postorder.length-1);
    }
    
    private TreeNode recurseBuildTree(int[] inorder, int[] postorder, int iStart, int iEnd, int pStart, int pEnd)
    {
        if(iStart>iEnd || pStart>pEnd)
        {
            return null;
        }
        int root = postorder[pEnd];
        int newIStart = iStart;
        while(inorder[newIStart]!=root && newIStart<iEnd)
        {
            ++newIStart;
        }
        int left = newIStart - iStart;
        TreeNode n = new TreeNode(root);
        n.left = recurseBuildTree(inorder,postorder,iStart,iStart + left-1,pStart,pStart+ left-1);
        n.right = recurseBuildTree(inorder,postorder,iStart + left+1,iEnd,pStart+left,pEnd-1);
        return n;
    }
    
}
