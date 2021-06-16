package com.sudreeshya.day3;

import com.sudreeshya.day3.calculator.Calculator;

public class Main {

  public static void main(String args[]) {
    System.out.println("Starting Main Program...");
    Calculator calculator = new Calculator();
    System.out.println("Adding : " + calculator.add(1.1, 1.1));
    System.out.println("Subtracting : " + calculator.sub(3.1, 1.1));
  }
}
