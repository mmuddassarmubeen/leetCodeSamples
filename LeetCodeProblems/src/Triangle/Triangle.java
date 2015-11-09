/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle;

import java.util.List;

/**
 *
 * @author Muddassar
 */
public class Triangle {
    
    public int minimumTotal(List<List<Integer>> trgl) {
    int sz = trgl.size();
    int[] results = new int[sz+1];

    for(int i=sz-1; i>=0; i--) {
        List<Integer> tmp = trgl.get(i);

        for(int j=0; j<tmp.size(); j++) {
            results[j] = Math.min(results[j], results[j+1]) + tmp.get(j);
        }
    }
    return results[0];
    }
}
