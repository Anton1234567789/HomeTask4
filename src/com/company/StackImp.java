package com.company;
import java.util.*;

public class StackImp<E> implements Stack<E> {
    @Override
    public boolean equals(Object obj) {
        if(obj==this){
         return true;
        }
        else if(!(obj instanceof StackImp)){
            return false;
        }
        StackImp stackImp = (StackImp) obj;
        return stackImp.equals(this);
    }

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 5;


    public StackImp(){
        elements = (E[])new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void push(E o) {
        elements[size++] = o;

    }

    @Override
    public E pop()  {

        if (size==0) {
            throw new EmptyStackException();

        }
        E result = (E)elements[-size];
        elements[size] = null;

        return result;

    }

    @Override
    public void clear() {

    }


    public void print() {
        for (Object str : elements){
            System.out.println(str);
        }
    }
    public boolean isEmpty(){
        return size ==0;
    }


}
