package edu.cnm.deepdive;

public class ClassC {

  private static double staticData = getTrickyData();

  private double instanceData = getTrickyData();

  private static double getTrickyData() {
    System.out.println("ClassC::getTrickyData");
    return -1.0;
  }

  public ClassC() {
    System.out.println("ClassC::new");
  }

  {
    System.out.println("ClassC::Instance");
  }

  public static double getStaticData() {
    return staticData;
  }

  public static void setStaticData(double staticData) {
    ClassC.staticData = staticData;
  }

  public double getInstanceData() {
    return instanceData;
  }

  public void setInstanceData(double instanceData) {
    this.instanceData = instanceData;
  }
}
