package com.mphasis.main.cui;


import math.Arithmetic;

class Point{

    public Point(){
        System.out.println("Constructor");
    }
    static{
        System.out.println("Static Initializer");
    }
    {
        System.out.println("Inline block");
    }

    public static void test(){
        System.out.println("tested...");
    }
}

public class Main {

    public static void main(String[] args) {
        try {
            Point point =(Point)Class.forName("com.mphasis.main.cui.Point").newInstance();
            Arithmetic arithmetic = new Arithmetic();
            arithmetic.sum(2,4);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
