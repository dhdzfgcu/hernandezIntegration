// Darian Hernandez
// This is a class that multiplies numbers for my unbelievably convoluted calculator

/**
 * This class returns the product of two values.
 * 
 * @author dahernandez0094
 *
 */
public class MultiplicationClass {
  private static double multNum1;
  private static double multNum2;

  // Here's the this keyword being used
  public static void setMultNum1(double multNum1) {
    MultiplicationClass.multNum1 = multNum1;
  }

  public static void setMultNum2(double multNum2) {
    MultiplicationClass.multNum2 = multNum2;
  }

  public static double getMultiplication() {
    double finalMult = multNum1 * multNum2;
    return finalMult;
  }


  public static double getMultiplication(int multNum1) {
    double finalMult = multNum1 * multNum2;
    return finalMult;
  }
}

