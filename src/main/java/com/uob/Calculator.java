package com.uob;

public class Calculator {
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) { // empty catch block
            print("Error");
        }
        return 0;
    }
}
