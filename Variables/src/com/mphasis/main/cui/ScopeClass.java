package com.mphasis.main.cui;

public class ScopeClass {
    private int num1=1;

    public void firstMethod() {
        int num1=2,num2=4;
        this.num1=num1+num2;
        System.out.println(num1);
        System.out.println(num2);
        secondMethod(7);
    }

    public void secondMethod(int num1) {
        int num2=5;
        System.out.println(num1);System.out.println(num2);
    }
}
