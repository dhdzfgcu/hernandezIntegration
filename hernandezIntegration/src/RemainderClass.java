// Darian Hernandez
// This is a class that gets remainders from quotients for my unbelievably convoluted calculator
public class RemainderClass {
  private static double remNum1;
  private static double remNum2;

  public static void setRemNum1(double remNum1) {
    RemainderClass.remNum1 = remNum1;
  }

  public static void setRemNum2(double remNum2) {
    RemainderClass.remNum2 = remNum2;
  }

  public static double getRemainder() {
    double finalRem = remNum1 % remNum2;
    return finalRem;
  }
}
