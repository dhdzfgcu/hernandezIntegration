// Darian Hernandez
// This class sets the returns the age of the User
public class UserAge {
  private static int bDay;
  private static int bMonth;
  private static int bYear;
  private String message1;

  // Example of a constructor with parameters
  public UserAge(int bd, int bm, int by) {
    setBDay(bd);
    setBMonth(bm);
    setBYear(by);
  }

  public UserAge(String message1) {
    // example of the this keyword
    this.message1 = message1;
  }

  public void returnMessage() {
    System.out.println(message1);
  }

  // overloaded method
  public void returnMessage(int bYear) {
    System.out.println(bYear + ", what a great year huh.");
  }

  // Example of a constructor without parameters
  public UserAge() {
    System.out.println("Thank You");
  }

  public void birthdaySong() {
    System.out.println("Happy birthday to");
  }


  public static void setBDay(int bd) {
    bDay = ((bd > 0 && bd <= 31) ? bd : 0);
  }

  public static void setBMonth(int bm) {
    bMonth = ((bm > 0 && bm <= 12) ? bm : 0);
  }

  public static void setBYear(int by) {
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
