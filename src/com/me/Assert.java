package com.me;

public class Assert {
    public static void test(boolean value) {
        try {
            if (!value) throw new Exception("test does not pass");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
