package com.company;

import java.util.*;

public class StackImp implements Stack {

    private Object[] ints;
    private Arrays[] arrayses;
    private int top;

    public StackImp(int capacity){
        ints = new Object[capacity];
        arrayses = new Arrays[capacity];
    }
    @Override
    public void push(Object o) throws StackException {

            if (ints.length==top){
                throw new StackException("Stack is Full");
            }
            ints[top++]=o;

    }

    @Override
    public Object pop() throws StackException {
        if (ints.length==0){
            throw new StackException("Stack is empty");
        }
        top--;
        Object obj = ints[top];
        ints[top]=null;
        return obj;
    }

    @Override
    public void clear() {
        ints = arrayses;
    }

    @Override
    public void print() {

        for (Object obj : ints){
            System.out.print(obj+" ");
        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StackImp stackImp = (StackImp) o;

        if (top != stackImp.top) return false;
        return Arrays.equals(ints, stackImp.ints);

    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(ints);
        result = 31 * result + top;
        return result;
    }

}
