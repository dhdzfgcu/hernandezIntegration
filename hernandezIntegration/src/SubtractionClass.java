// Darian Hernandez
// This is a class that subtracts numbers for my unbelievably convoluted calculator
public class SubtractionClass {
  private static double subNum1;
  private static double subNum2;

  // These ^ are an example of arguments
  public static void setSubNum1(double subNum1) {
    SubtractionClass.subNum1 = subNum1;
  }

  public static void setSubNum2(double subNum2) {
    SubtractionClass.subNum2 = subNum2;
  }

  public static double getSubtraction() {
    double finalSub = subNum1 - subNum2;
    return finalSub;
  }
}


