package edu.cnm.deepdive;

public class ClassA {

  static {
    System.out.println("ClassA::Static 1");
  }

  private static int data = getValue();

  private static int getValue() {
    System.out.println("ClassA::getValue");
    return 10;
  }

  static {
    System.out.println("ClassA::Static 2");
  }




}
