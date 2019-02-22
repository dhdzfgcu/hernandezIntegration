
public class DivisionClass {
  private static double divNum1;
  private static double divNum2;
  public void setDivNum1(double divNum1) {
    DivisionClass.divNum1 = divNum1;
  }
  public void setDivNum2(double divNum2) {
    DivisionClass.divNum2 = divNum2;
  }
  public static  double getDivision() {
    double finalDiv = divNum1/divNum2;
    return finalDiv;
  }
}
