// Darian Hernandez
// This is a class that gets remainders from quotients for my unbelievably convoluted calculator

/**
 * This class returns remainders when given two values.
 * 
 * @author dahernandez0094
 *
 */
public class RemainderClass {
  private static double remNum1;
  private static double remNum2;

  public static void setRemNum1(double remNum1) {
    RemainderClass.remNum1 = remNum1;
  }

  public static void setRemNum2(double remNum2) {
    RemainderClass.remNum2 = remNum2;
  }

  /**
   * Returns the remainder of two numbers.
   * 
   * @return remainder when given two numbers.
   */
  public static double getRemainder() {
    double finalRem = 0;
    try {
      finalRem = remNum1 % remNum2;

    } catch (Exception e) {
      System.out.println("Invalid input, please try again");
    }
    return finalRem;
  }
}
