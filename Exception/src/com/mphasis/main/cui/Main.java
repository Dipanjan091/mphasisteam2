package com.mphasis.main.cui;

import java.sql.SQLException;

class Base{
    public void test()throws SQLException {

    }
}

class Derived extends Base{
    @Override
    public void test() {

    }
}


public class Main {

    public static void main(String[] args){
  int firstNumber=0, SecondNumber=0;
  try{
      firstNumber = Integer.parseInt(args[0]);
      SecondNumber = Integer.parseInt(args[1]);
      System.out.println("End of try block");
  }
   catch (ArrayIndexOutOfBoundsException exception){
       System.out.println("Provide 2 Numbers");
  try {
      System.out.println(firstNumber/SecondNumber);
  }
  catch (NumberFormatException exception1){
      System.out.println("You can't divide by zero");
  }
   }
  catch (NumberFormatException exception)
  {
      System.out.println("Please provide a valid Number");
  }
catch (ArithmeticException exception )
{
    System.out.println("You can't divide by zero");
}
        System.out.println("The End");
    }
}
