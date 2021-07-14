package com.mphasis.main.cui;

interface Printer{
    public void print(String str);
}


public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(){
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };
        printer.print("India");


        Printer printer2 = (str) -> System.out.println(str);
        printer2.print("Canada");

        Printer printer3 = System.out::println;
        printer3.print("Switzerland");

        execute((str) -> System.out.println(str),"Netherland");
        execute(System.out::println,"Iceland");
    }
    public static void execute(Printer printer,String country){
        printer.print(country);
    }
}
