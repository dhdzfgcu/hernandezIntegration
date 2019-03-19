// Darian Hernandez
// This class sets the date for the age return class
public class DateSet {
  private static int day;
  private static int month;
  private static int year;

  public DateSet(int d, int m, int y) {
    setDay(d);
    setMonth(m);
    setYear(y);
  }

  public void setDay(int d) {
    day = ((d > 0 && d <= 31) ? d : 0);
  }

  public void setMonth(int m) {
    month = ((m > 0 && m <= 12) ? m : 0);
  }

  public void setYear(int y) {
    year = ((y > 0 && y <= 2020) ? y : 0);
  }

  public static int getDay() {
    return day;
  }

  public static int getMonth() {
    return month;
  }

  public static int getYear() {
    return year;
  }
}
