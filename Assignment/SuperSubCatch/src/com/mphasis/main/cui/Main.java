package com.mphasis.main.cui;

class SuperSubCatch {
    public static void main(String args[]) {
        try {
            int a = 7;
            int b = 42 / a;
        } catch(ArithmeticException e) { // ERROR - unreachable
            System.out.println("This is never reached.");
        } catch(Exception e) {
            System.out.println("Generic Exception catch.");
        }

    }
}
