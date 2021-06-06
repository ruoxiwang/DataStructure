package com.me;

public class Stack<E> extends ArrayList<E>{
    private int size;

    public void push(int element) {
        add(element);
    }

    public int pop() {
        return remove(size-1);
    }

    public int top() {
        return get(size-1);
    }
}
