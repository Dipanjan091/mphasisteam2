package com.mphasis.main.cui;

class ThrowsDemo {
    static void throwOne() {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) throws IllegalAccessException {
        throwOne();
    }
}