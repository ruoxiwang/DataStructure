package com.me;

public abstract class AbstractList<E> implements List<E>{
    protected int size;
    protected E[] elements;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i]==element) return i;
        }
        return ELEMENT_NOT_FOUND;
    }

    protected void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:"+index+", Size:"+size);
    }

    protected void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    protected void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
    }


}
