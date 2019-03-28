// Darian Hernandez
// This class sets the date for the age return class
public class UserAge {
  private static int day;
  private static int month;
  private static int year;
  private static int bDay;
  private static int bMonth;
  private static int bYear;
//use the date class java util tutorialspoint
  public UserAge(int d, int m, int y, int bd, int bm, int by) {
    setDay(d);
    setMonth(m);
    setYear(y);
    setBDay(bd);
    setBMonth(bm);
    setBYear(by);
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
  public void setBDay(int bd) {
    bDay = ((bd > 0 && bd <= 31) ? bd : 0);
  }

  public void setBMonth(int bm) {
    bMonth = ((bm > 0 && bm <= 12) ? bm : 0);
  }

  public void setBYear(int by) {
    bYear = ((by > 0 && by <= 2020) ? by : 0);
  }
  public static int getBDay() {
    return bDay;
  }

  public static int getBMonth() {
    return bMonth;
  }

  public static int getBYear() {
    return bYear;
  }
}

