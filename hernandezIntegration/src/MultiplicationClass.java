// Darian Hernandez
// This is a class that multiplies numbers for my unbelievably convoluted calculator
public class MultiplicationClass {
  private static double multNum1;
  private static double multNum2;

  // Here's the this keyword being used
  public void setMultNum1(double multNum1) {
    MultiplicationClass.multNum1 = multNum1;
  }

  public void setMultNum2(double multNum2) {
    MultiplicationClass.multNum2 = multNum2;
  }

  public static double getMultiplication() {
    double finalMult = multNum1 * multNum2;
    return finalMult;
  }

}

