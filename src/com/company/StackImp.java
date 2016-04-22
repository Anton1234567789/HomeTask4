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
        stackImp.push("E6");



       // stackImp.pop("E2");
        stackImp.print();
    }
    private ArrayList arrayList = new ArrayList();

    private int top = 0;

    StackImp(int capacity){
        this.arrayList = new ArrayList(capacity);

    }

    @Override
    public void push(Object o) throws StackException {
        if (arrayList.size()+1==arrayList.size()){
            throw new StackException("is full");
        }
        ArrayList list = this.arrayList;


        arrayList.add(o);
    }

    @Override
    public Object pop(Object o) throws StackException {
        if (arrayList.isEmpty()){
            throw new StackException("Stack is empty");
        }
        arrayList.remove(o);
        return null;
    }

    @Override
    public void clear() {
        arrayList.clear();
    }

    @Override
    public void print() {

        for (Object obj : arrayList){
            System.out.print(obj+" ");
        }
    }
}
