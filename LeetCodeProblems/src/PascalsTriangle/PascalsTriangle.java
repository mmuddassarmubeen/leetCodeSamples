/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muddassar
 */
public class PascalsTriangle {
    
    public List<List<Integer>> generate(int numRows) {
        
        if(numRows<1)
        {
            return null;
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows >= 1)
        {
            List<Integer> lt = new ArrayList<Integer>();
            lt.add(1);   
            res.add(lt);
        }
        if(numRows >= 2)
        {
            List<Integer> lt = new ArrayList<Integer>();
            lt.add(1);
            lt.add(1);
            res.add(lt);
        }
        
        for(int i=2;i<numRows;i++)
        {
            List<Integer> parent = res.get(i-1);
            List<Integer> nlt = new ArrayList<Integer>();
            nlt.add(1);
            for(int j=1;j<parent.size();j++)
            {
                nlt.add(parent.get(j-1) + parent.get(j));   
            }
            nlt.add(1);
            res.add(nlt);
        }
        return res;
        
    }
    
}
