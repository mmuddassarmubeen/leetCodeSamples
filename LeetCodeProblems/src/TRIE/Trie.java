/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRIE;

import java.util.Set;

/**
 *
 * @author Muddassar
 */
public class Trie {
    
    private TrieNode head;

    public Trie() {
        head = new TrieNode(null);
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode finder = head;
        int i = 0;
        for(; i<word.length();i++)
        {
            if(finder.nodes.containsKey(word.substring(i,i+1)))
            {
                finder = finder.nodes.get(word.substring(i, i+1));
            }
            else
            {
                break;
            }
        }
        for(;i<word.length();i++)
        {
            TrieNode node = new TrieNode(word.substring(i,i+1));
            finder.nodes.put(word.substring(i,i+1), node);
            finder = finder.nodes.get(word.substring(i,i+1));
            
        }
        if(i == word.length())
        {
            finder.end = true;
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode finder = head;
        
        int i =0;
        for(;i<word.length();i++)
        {
            Set<String> val = finder.nodes.keySet();
            if(finder.nodes.containsKey(word.substring(i,i+1)))
            {
                finder = finder.nodes.get(word.substring(i, i+1));
            }
            else
            {
                return false;
            }
            
        }
        if(i == word.length() && finder.end==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode finder = head;
        
        for(int i=0;i<prefix.length();i++)
        {
            Set<String> val = finder.nodes.keySet();
            if(finder.nodes.containsKey(prefix.substring(i,i+1)))
            {
                finder = finder.nodes.get(prefix.substring(i, i+1));
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    
    public boolean searchPattern(String word) {
     
        TrieNode finder = head;
        for(int i=0; i<word.length();i++)
        {
            Set<String> val = finder.nodes.keySet();
            
            if(word.substring(i, i+1).equals("."))
            {
                for(String v : val)
                {
                    finder = finder.nodes.get(val);
                    continue;
                }
            }
            
            if(finder.nodes.containsKey(word.substring(i,i+1)))
            {
                finder = finder.nodes.get(word.substring(i, i+1));
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    
}
