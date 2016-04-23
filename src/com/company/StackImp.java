package com.company;

import java.util.*;

public class StackImp implements Stack {

    public static void main(String[] args) throws StackException {
        StackImp stackImp = new StackImp(5);
        stackImp.push("E1");
        stackImp.push("E2");
        stackImp.push("E3");
        stackImp.push("E4");
        stackImp.push("E5");
        //stackImp.push("E6");


      //  stackImp.pop();
       // stackImp.pop();
        //stackImp.clear();
        stackImp.print();

    }


    private Object[] ints;

    private int top;

    public StackImp(int capacity){
        ints = new Object[capacity];

        //top=-1;

    }

    @Override
    public void push(Object o) throws StackException {
        try {
            ints[top++]=o;

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Object pop() throws StackException {
        if (ints.length==0){
            throw new StackException("Stack is empty");
        }
        top--;
        Object obj = ints[top];
        ints[top]="_";
        return obj;
    }

    @Override
    public void clear() {
        for(int i =0; i<ints.length;i++){
            ints[i]="_";
        }
    }

    @Override
    public void print() {

        for (Object obj : ints){
            System.out.print(obj+" ");
        }
    }
}
