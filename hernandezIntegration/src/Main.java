// My name is Darian Hernandez and I'm gonna become the best hokage ever, believe it!
// This program serves as an example of what I've learned in COP2006
import java.util.Scanner;
import java.util.Random;

public class Main {

  // this is a header
  // public is an access modifier
  // void is the return type
  public static void main(String[] args) {
    Scanner decision = new Scanner(System.in);
    System.out.println("Welcome to my Integration project!");
    System.out.println("Would you like to:");
    System.out.println("\t 1: See some explanations");
    System.out.println("\t 2: Have some fun");
    System.out.println("\t 3: Use a calculator");
    int menuChoice = decision.nextInt();
    switch (menuChoice) {
      case 1:
        example(decision);
        break;
      case 2:
        fun(decision);
        break;
      case 3:
        mathTime(decision);
        break;
        default:
          System.out.println("Invalid input, try again");


      /*
       * A byte is a data type that is composed of 8 bits signed two's complement integer. Min value
       * is -128 and a maximum of 127 (inclusive). Useful for saving memory in large arrays, also
       * can be used in place of int. Short data type is 16 bit signed two's complement integer, min
       * value of -32768, and a maximum of 32767 inclusive. Same guidelines with byte Int is a 32
       * bit same stuff above. min value of -2^31, max value of (2^31)-1.In java se 8 and higher the
       * int type can be used to rep an unsigned 32 bit integer, which has a min value of 0 and max
       * value of (2^32)-1. Integer class is used to use int data type as an unsigned integer.
       * Static methods ex: compareUnsigned, divideUnsigned, have been added to the integer class to
       * support math stuff down da line Long data type is 64 bit, same stuff as above. Signed long
       * has a min value of -2^63, max value of 2^63)-1. Java se 8 and later, long data type reps
       * unsigned 64 bit long, min value 0, max value of 2^64)-1, Use the data type when you need a
       * range of values wider than int's. Long class also contains methods like compareUnsigned,
       * divideUnsigned. Float data type is a single precision 32 bit IEEE 754 floating point. Very
       * big range of values, use a float if you need to save large amounts of memory, should never
       * be used for precise values ex currency. For that use java.math.BigDecimal class. Double
       * data type is a double precision 64 bit IEEE 754 floating point. Range of values is very
       * big, decimal values, this data type is used. Never used for currency/precise values.
       * Boolean data type has only two values: true or false. Used for simple flags that track t/f,
       * only reps one bit of info, no real size Char data type is single 16 bit unicode character.
       * Min val of '\u0000' or just 0 and a max value of '\uffff' (or 65535 inclusive) Default
       * values: Byte:0 Short:0 Int:0 Long:0L Float:0.0f Double:0.0d Char:'\u0000' String (any
       * object):null Boolean:false
       */
    }
  }

  public static void example(Scanner decision) {
    boolean boolean1 = true;
    System.out.println("Here's an example of a boolean:" + " " + boolean1);
    int int1 = 105;
    System.out.println("Here's an example of an int:" + " " + int1);
    final double double1 = 10.2;
    // h++
    /*
     * The final keyword (in variables) means that a value cannot be cannot be changed. If h++ was
     * not commented out, it would cause this to crash, as the final keyword was used to make the
     * value of h immutable
     */
    // Scope means that a variable is only accessible in the method that it is declared.
    // A variable is a section of memory that holds a value
    System.out.println("Here's an example of a double:" + " " + double1);
    String string1 = "here's an example of a string";
    System.out.println(string1);
    int method1 = string1.length();
    System.out.println("Here's the length of the string string1:" + " " + method1);
    String method2 = string1.substring(0, 1).toUpperCase() + string1.substring(1);
    System.out.println(method2 + " " + "that has had the first letter capitalized using methods.");
    System.out.println(Integer.toString(11) + 5);
    // above is an example of casting, if I did not convert the integer 11 to a string, the result
    // would have come out to 16, but since it is a string, it cannot be added with the integer 5.
    String string2 =
        "Here's \b an example of a \"string\" that has been \\ formatted using \t escape \'sequences\'.";
    // Sorry this is so disgusting to read
    System.out.println(string2);
  }



  public static void fun(Scanner decision) {
    System.out.println("What's your favorite color?");
        decision.nextLine();
    String choice = decision.nextLine();
    String finChoice = favColor(choice);
    System.out.println(finChoice);

    System.out.println("Would you like some lucky numbers for today ^_^?");

    String luckyDecision = decision.nextLine();
    if ((luckyDecision.toLowerCase()).equals("no")) {
      System.out.println("If you say so....");
    } else if ((luckyDecision.toLowerCase()).equals("yes")) {
      Random lucky = new Random();
      int number1;
      for (int i = 1; i <= 7; i++) {
        number1 = 1 + lucky.nextInt(100);
        while (number1 == 4) {
          number1 = 1 + lucky.nextInt(100);
        }
        System.out.println(number1);
      }
    } else {
      System.out.println("Invalid, try again");
    }

    System.out.println("Welcome to mcdonalds please enter your order number 1-5");
    int orderNumber = decision.nextInt();
    switch (orderNumber) {
      case 1:
        System.out.println("chincken nungent");
        break;
      case 2:
        System.out.println("hamborger");
        break;
      case 3:
        System.out.println("chebruger");
        break;
      case 4:
        System.out.println("h");
        break;
      case 5:
        System.out.println("sheer heart attack");
        break;
      case 69:
        System.out.println("haha nice");
        break;
      default:
        System.out.println("I don't work at mcdonalds");
    }

  }



  public static String favColor(String decisionC) {
    String response1 = "Right Answer!";
    String response2 = ">:(";
    if ((decisionC.toLowerCase()).equals("blue") || (decisionC.toLowerCase()).equals("purple")) {
      return response1;
    } else {
      return response2;
    }

  }
  public static void mathTime(Scanner decision) {
    System.out.println("What basic operation would you like to perform?");
    System.out.println("\t 1: Addition");
    System.out.println("\t 2: Subtraction");
    System.out.println("\t 3: Division");
    System.out.println("\t 4: Rounded Division");
    System.out.println("\t 5: Multiplication");
    int calChoice = decision.nextInt();
    switch (calChoice){
      case 1:
        addition(decision);
        break;
      case 2:
        subtraction(sub);
        break;
      case 3:
        division(div);
        break;
      case 4:
        divisionR(divR);
        break;
      case 5:
        mult(mult);
        break;
    }
    
  }
  public static double addition(Scanner decision) {
    additionClass additionM1 = new additionClass();
    additionClass additionM2 = new additionClass();
    System.out.println("Please enter the first number you would like to add");
    additionM1.setAddNum1(decision.nextDouble());
    additionM2.setAddNum2(decision.nextDouble());
    System.out.println();
    
  
  }
}
