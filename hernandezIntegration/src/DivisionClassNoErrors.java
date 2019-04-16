// Darian Hernandez
// This class is the DivisionClass but with no errors
public class DivisionClassNoErrors extends DivisionClass {

  public DivisionClassNoErrors() {}

  /*
   * Inheritance is a tool in programming that allows one class to inherit the fields and methods of
   * another class. Example of an "Is-A" relationship. Example: (If Animal is the Super class and
   * Pig is the Sub class, then Pig "is-a" Animal. Inheritance allows us to avoid copy and pasting
   * code into new classes in order to accomplish a new, related task.
   */
  {
    try {
      // Here's an example of the super keyword
      super.getDivision();

    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
  }
}

