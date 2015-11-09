/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRIE;

import java.util.HashMap;

/**
 *
 * @author Muddassar
 */
public class TrieNode {
    
    public String val;
    public HashMap<String,TrieNode> nodes;
    public boolean end;
    
    public TrieNode(String s)
    {
        this.val = s;
        nodes = new HashMap<String, TrieNode>();
    }
    
}
