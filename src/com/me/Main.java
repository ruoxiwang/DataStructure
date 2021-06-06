package com.me;

import com.me.circle.DoubleCircleLinkedList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        list.add(3, 40);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }

    static void josephus() {
        DoubleCircleLinkedList<Object> list = new DoubleCircleLinkedList<>();
        for (int i = 0; i < 8; i++) {
            list.add(i, i);
        }
        list.reset();
        while (list.isEmpty()) {
            list.next();
            list.next();
            list.remove();
        }
    }
}
