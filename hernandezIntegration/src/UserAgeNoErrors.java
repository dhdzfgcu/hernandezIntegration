// Darian Hernandez
// This is the UserAge class but with no errors, and is being used for inheritance examples as well.
public class UserAgeNoErrors extends UserAge {

  public UserAgeNoErrors(int bd, int bm, int by) {
    super(bd, bm, by);

  }

  public UserAgeNoErrors(String message1) {
    super(message1);
  }

  @Override
  public void birthdaySong() {
    System.out.println("Happy birthday to YOU");
  }

  // Here's an example of polymorphism
  public UserAgeNoErrors() {

  }

}
