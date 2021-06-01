package com.me;

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
}
