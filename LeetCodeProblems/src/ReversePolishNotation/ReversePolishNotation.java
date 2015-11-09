/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReversePolishNotation;

import java.util.Stack;

/**
 *
 * @author Muddassar
 */
public class ReversePolishNotation {
    
    
    public int evalRPN(String[] tokens) {
        
        if(tokens.length == 0)
        {
            return 0;
        }
        Stack<String> st = new Stack<String>();
        for(String v : tokens)
        {
            boolean operand = false;
            try
            {
                Integer.parseInt(v);
                operand = true;
            }
            catch(NumberFormatException ex)
            {
                
            }
            if(operand)
            {
                st.push(v);
            }
            else
            {
                String res = "0";
                int op1 = 0;
                int op2 = 0;
                if(!st.isEmpty())
                {
                     op1 = Integer.parseInt(st.pop());
                }
                if(!st.isEmpty())
                {
                     op2 = Integer.parseInt(st.pop());
                }
                
                if(v.equals("+"))
                {
                    res = String.valueOf(op1 + op2);
                }
                else if(v.equals("-"))
                {
                    res = String.valueOf(op2 - op1);
                }
                else if(v.equals("/"))
                {
                    res = String.valueOf(op2 / op1);
                }
                else if(v.equals("*"))
                {
                    res = String.valueOf(op2 * op1);
                }
                st.push(res);
            }
            
        }
        return Integer.parseInt(st.pop());
    }
}
