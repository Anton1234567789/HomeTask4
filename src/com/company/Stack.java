package com.company;

import java.util.*;
import java.util.EmptyStackException;
import java.util.Objects;

public interface Stack  {

    void push(Object o) throws StackException;

    Object pop() throws  StackException;

    void clear();

    void print();

}
class StackException extends Exception {

    public StackException(String message){
        super(message);
    }


}