package com.example.megha.scientificcalculator;

import java.util.ArrayList;

/**
 * Created by megha on 13/7/16.
 */
public class Stack {
    private ArrayList<String> stack;
    private int top;
    Stack(){
        stack = new ArrayList<>();
        top = -1;
    }
    public void push(String element){
        stack.add(element);
        top++;
    }
    public String pop(){
        String element = Constants.nothing;
        if(top > -1)
            element = stack.remove(top--);
        return element;
    }
    public String viewLast(){
        String element = Constants.nothing;
        if(top > -1)
            element = stack.get(top);
        return element;
    }
    public void emptyStack(){
        stack = new ArrayList<>();
        top = -1;
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}