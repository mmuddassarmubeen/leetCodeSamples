/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidParentheses;

import java.util.Stack;

/**
 *
 * @author Muddassar
 */
public class ValidParentheses {
    
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray())
        {
            if(c=='{' || c=='(' || c=='[')
            {
                st.push(c);
            }
            else
            {
                char t = st.pop();
                switch(c)
                {
                    case '}':
                        {
                            if (t!='{')
                            {
                                return false;
                            }
                            break;
                        }
                        case ')':
                        {
                            if (t!='(')
                            {
                                return false;
                                
                            }
                            break;
                        }
                        case ']':
                        {
                            if (t!='[')
                            {
                                return false;
                            }
                            break;
                        }
                }
                
            }
            
        }
        if(st.empty())
        {
            return true;
        }
        return false;
    }
}
