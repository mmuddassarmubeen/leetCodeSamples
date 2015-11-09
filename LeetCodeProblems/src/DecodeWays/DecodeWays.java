/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecodeWays;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Muddassar
 */
public class DecodeWays {
    
    HashMap<String,Integer> memoize = new HashMap<String,Integer>();
     ArrayList<String> map = null;
    
   public int numDecodings(String s) {
    
       if(map == null)
       {
            map = new ArrayList<String>();
            map.add("1");
            map.add("2");
            map.add("3");
            map.add("4");
            map.add("5");
            map.add("6");
            map.add("7");
            map.add("8");
            map.add("9");
            map.add("10");
            map.add("11");
            map.add("12");
            map.add("13");
            map.add("14");
            map.add("15");
            map.add("16");
            map.add("17");
            map.add("18");
            map.add("19");
            map.add("20");
            map.add("21");
            map.add("22");
            map.add("23");
            map.add("24");
            map.add("25");
            map.add("26");
            
       }
        if(s.length()==0)
        {
            return 0;
        }
        if(s.length() == 1)
        {
            if(map.contains(s))
            {
                return 1;
            }
            return 0;
        }
        if(s.length() == 2)
        {
            if(s.charAt(0)=='0')
            {
                return 0;
            }
            if(map.contains(s))
            {
                return 1 + numDecodings(s.substring(1,s.length()));
            }
            
            else if(Integer.parseInt(s)>26)
            {
                return numDecodings(s.substring(1,s.length()));
            }
            return 0;
            
        }
        
        if(s.charAt(0)=='0')
        {
            return 0;
        }
        if(memoize.containsKey(s))
        {
            return memoize.get(s);
        }
        int result = numDecodings(s.substring(1,s.length()));
        if(map.contains(s.substring(0, 2)))
        {
            result +=  numDecodings(s.substring(2,s.length()));
        }
        memoize.put(s, result);
        return memoize.get(s);
    }
    
}
