package com.me;

public class CircleDeque<E> {
    private int size;
    private int front;
    private E[] elements;
    public static final int DEFAULT_CAPACITY = 10;

    public CircleDeque(int size) {
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enQueueRear(E element) {
        ensureCapacity(size+1);
        elements[index(size)] = element;
    }

    public E deQueueRear() {
        int rearIndex = index(size-1);
        E rear = elements[rearIndex];
        elements[rearIndex] = null;
        size--;
        return rear;
    }

    public void enQueueFront(E element) {
        ensureCapacity(size+1);
        elements[index(-1)] = element;
    }

    public E deQueueFront() {
        E front = elements[this.front];
        elements[this.front] = null;
        size--;
        return front;
    }

    public E front() {
        return elements[front];
    }

    public E rear() {
        return elements[index(size-1)];
    }

    private int index(int index) {
        index += front;
        if (index < 0) {
            return index + elements.length;
        }
        return index % elements.length;
    }

    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= size) return;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[index(i)];
        }
        elements = newElements;
        front = 0;
    }

}
