/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinStack;

import java.util.LinkedList;

/**
 *
 * @author Muddassar
 */
public class MinStack {
    
    LinkedList<Integer> lt = new LinkedList<>();
    LinkedList<Integer> min = new LinkedList<>(); 
    
    public void push(int x) {
        
        lt.push(x);
        if(min.isEmpty())
        {
            min.push(x);
        }
        else
        {
            if(min.peek()>=x)
            {
                min.push(x);
            }
        }
    }

    public void pop() {
        int v = lt.peek();
        if(!lt.isEmpty())
        {
            lt.pop();
        }
        if(min.peek() == v)
        {
            min.pop();
        }
    }

    public int top() {
        return lt.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
