// Darian Hernandez
// This is a class that divides numbers for my unbelievably convoluted calculator
/**
 * This class returns quotients for two given numbers.
 * 
 * @author dahernandez0094
 *
 */
public class DivisionClass {
  // Example of private fields
  private static float divNum1;
  private static float divNum2;

  // Example of Setters
  public static void setDivNum1(float divNum1) {

    DivisionClass.divNum1 = divNum1;
  }

  public static void setDivNum2(float divNum2) {
    DivisionClass.divNum2 = divNum2;
  }

  // Example of a Getter
  /**
   * Returns the quotient of the two numbers given.
   * 
   * @return the quotient of the two numbers given.
   */
  public static float getDivision() {
    if (divNum2 == 0) {
      throw new ArithmeticException("Invalid Input, try again");
    } else {
      return divNum1 / divNum2;
    }
  }
}


