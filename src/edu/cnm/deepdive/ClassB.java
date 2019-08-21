package edu.cnm.deepdive;

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
    ClassC c2 = new ClassC();
    c1.setInstanceData(Double.MAX_VALUE);
    c1.setStaticData(Double.MIN_VALUE);
    System.out.printf("%s.%s = %f%n", "c1", "instanceData", c1.getInstanceData());
    System.out.printf("%s.%s = %f%n", "c1", "staticData", c1.getStaticData());
    System.out.printf("%s.%s = %f%n", "c2", "instanceData", c2.getInstanceData());
    System.out.printf("%s.%s = %f%n", "c2", "staticData", c2.getStaticData());

  }

}
