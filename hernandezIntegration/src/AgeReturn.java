// Darian Hernandez
// Class of some examples
public class AgeReturn extends DateSet {
  private int dayBirth;
  private int monthBirth;
  private int yearBirth;
DateSet(int d, int m, int y){
  super(d, m, y);
}
  public AgeReturn(int day1, int month1, int year1) {
    dayBirth = setDay(day1);
    monthBirth = setMonth(month1);
    yearBirth = setYear(year1);
  }
}
