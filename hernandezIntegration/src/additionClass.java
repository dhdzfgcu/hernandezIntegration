
public class additionClass {
  private double addNum1;
  private double addNum2;
  public void setAddNum1(double addNum1) {
    this.addNum1 = addNum1;
  }
  public void setAddNum2(double addNum2) {
    this.addNum2 = addNum2;
  }
  public double getAddition() {
    double finalAdd = addNum1 + addNum2;
    return finalAdd;
  }
}
