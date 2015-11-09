/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumRootToLeafNumbers;

import TreeNode.TreeNode;
import java.util.ArrayList;

/**
 *
 * @author Muddassar
 */
public class SumRootToLeafNumbers {
 
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        findNumbers(root, 0, arr);
        int sum = 0;
        for(int i : arr)
        {
            sum += i;
        }
        return sum;
    }
    
    private void findNumbers(TreeNode node, int value, ArrayList<Integer> arr)
    {
        if(node == null)
        {
            return;
        }
        int v = value*10 + node.val;
        if(node.left == null && node.right==null)
        {
            arr.add(v);
            return;
        }
        findNumbers(node.left,v,arr);
        findNumbers(node.right,v,arr);
    }
}
