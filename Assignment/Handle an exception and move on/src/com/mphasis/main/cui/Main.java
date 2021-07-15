package com.mphasis.main.cui;

// Handle an exception and move on.

import java.util.Random;


class HandleException {
    public static void main(String args[]) {
        int a=0, b=0, c=0;
        Random r = new Random();

        for(int i=0; i<32; i++) {

            b = r.nextInt();
            c = r.nextInt();
            a = 1 / (b/c);

           float a1 = a; // set a to zero and continue

            System.out.println("a: " + a1);
        }
    }
}