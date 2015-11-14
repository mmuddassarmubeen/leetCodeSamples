/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicCalculator;

import java.util.Stack;

/**
 *
 * @author Muddassar
 */
public class BasicCalculator {
    
    public int calculate(String s) {
        if(s.length() == 0)
        {
            return 0;
        }
        Stack<Integer> operand = new Stack<Integer>();
        Stack<String> operator = new Stack<String>();
        
        for(int i=0;i<s.length();i++)
        {
            String c = s.substring(i, i+1);
            if(c.equals(" "))
            {
                continue;
            }
            else if(c.equals("("))
            {
                operator.push(c);
            }
            else if(c.equals("+") || c.equals("-"))
            {
                while(!operator.empty() && operator.peek().equals("-"))
                {
                    int op1 = operand.pop();
                    int op2 = operand.pop();
                    String operation = operator.pop();
                    int value = cal(op2, op1, operation);
                    operand.push(value);
                }
                operator.push(c);
            }
            else if(c.equals(")"))
            {
                while(!operator.peek().equals("("))
                {
                    int op1 = operand.pop();
                    int op2 = operand.pop();
                    String operation = operator.pop();
                    int value = cal(op2, op1, operation);
                    operand.push(value);
                }
                operator.pop();
                
            }
            else
            {
                int num = Integer.parseInt(c);
                while(i<s.length()-1 && s.substring(i+1, i+2).matches("[0-9]"))
                {
                    num = num*10 + Integer.parseInt(s.substring(i+1, i+2));
                    i++;
                }
                operand.push(num);
            }
                
            
        }
        while(!operator.empty())
        {
            int op1 = operand.pop();
            int op2 = operand.pop();
            String operation = operator.pop();
            int value = cal(op2, op1, operation);
            operand.push(value);
        }
        int res = operand.pop();
        double i = 1;
        while(!operand.empty())
        {
            Double d = Math.pow(10, i);
            res  = operand.pop()* d.intValue() + res;
            i++;
        }
        
        return res;
    }
    
    private int cal(int i,int j, String operation)
    {
        if(operation.equals("+"))
        {
            return i+j;
        }
        else
        {
            return i-j;
        }
    }
    
}
