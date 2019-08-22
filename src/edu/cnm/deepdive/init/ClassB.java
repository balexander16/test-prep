package edu.cnm.deepdive.init;

public class ClassB extends ClassA {

  // static fields and instance fields get assigned a default value.
  // method fields do not!
  private static String stringData = getStringData();

  static {
    System.out.println("ClassB::static");
  }


  private static String getStringData() {
    System.out.println("ClassB::getStringData");
    return "some stuff";
  }

  public static void main(String[] args) {
    System.out.println("ClassB::main");
    ClassC c1 = new ClassC();
    ClassC c2 = new ClassD();
    ClassD d1 = new ClassD();
    c1.setInstanceData(10);
    c1 = d1;
    d1.setInstanceData(20);
    System.out.println(c1.getInstanceData());
  }

}
