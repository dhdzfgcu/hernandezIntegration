// Darian Hernandez
// This is a class that adds numbers for my unbelievably convoluted calculator

/**
 * This class returns the sum of two numbers.
 * 
 * @author dahernandez0094
 *
 */
public class AdditionClass {
  private static double addNum1;
  private static double addNum2;

  public static void setAddNum1(double addNum1) {
    AdditionClass.addNum1 = addNum1;
  }

  public static void setAddNum2(double addNum2) {
    AdditionClass.addNum2 = addNum2;
  }

  public static double getAddition() {
    double finalAdd = addNum1 + addNum2;
    return finalAdd;
  }
}


