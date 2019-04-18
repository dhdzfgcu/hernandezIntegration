// My name is Darian Hernandez and I'm gonna become the best hokage ever, believe it!
// This program serves as an example of what I've learned in COP2006
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Integration project for the class COP 2006, Spring 2019.
 * 
 * @author dahernandez0094
 *
 */
public class Main {
  // this is a header
  // public is an access modifier
  // void is the return type
  /**
   * Main method for the Main class.
   * 
   * @param args Driver class.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int continueProgram = 1;
    while (continueProgram == 1) {
      int menuChoice = 0;
      System.out.println("Welcome to my Integration project!");
      System.out.println("Would you like to:");
      System.out.println("\t 1: See some explanations");
      System.out.println("\t 2: Have some fun");
      System.out.println("\t 3: Use a calculator");
      System.out.println("\t 4: Find out how old you are");
      try {
        menuChoice = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("Invalid input, try again");
        scanner.nextLine();

      }
      switch (menuChoice) {
        case 1:
          showExample(scanner);
          break;
        case 2:
          haveFun(scanner);
          break;
        case 3:
          calculate(scanner);
          break;
        case 4:
          ageGet(scanner);
          break;
        default:
          System.out.print("");
          break;
      }


      /*
       * Operator precedence: Postfix (ex: expr++) Unary (ex: ++expr) Multiplicative: * / %
       * Additive: + - Shift: <<, etc Relational: <, etc Equality: == etc Bitwise and: & Bitwise
       * exclusive or: ^ Bitwise inclusive or: | Logical and: && Logical or: || Ternary: ?:
       * Assignment: = etc
       */
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
      System.out.println("Press 1 to continue or 2 to quit.");
      try {
        continueProgram = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("Invalid Input, try again");
      }
    }

  }



  /**
   * Shows the user examples of various programming concepts.
   * 
   * @param decision takes User input.
   */
  public static void showExample(Scanner decision) {
    System.out.println((3) % 5);
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
    String string2 = "Here's \b an example of a \"string\" that has been \\ formatted using \t "
        + "escape \'sequences\'.";
    // Sorry this is so disgusting to read
    System.out.println(string2);
    for (int i = 5; i > 0; i--) {
      System.out.println("Here is the number of statements remaining in this loop: " + (i - 1));
    }
    int ternary1 = 5;
    int ternary2 = (ternary1 == 6) ? 0 : 1;
    System.out.println("Here is an example of a ternary operator in action: " + ternary2);
    String compare1 = "This string will be compared to";
    String compare2 = "This string.";
    System.out.println(compare2.compareTo(compare1));
    System.out.println("What number would you like to break at (0-10) in the coming loop?");
    int breakExample = 0;
    try {
      breakExample = decision.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid Input, try again");
    }
    for (int i = 10; i > 0; i--) {
      if (i == breakExample) {
        break;
        // break is used to stop a loop in code
      }
      System.out.println(i);
    }
    // Example of a one dimensional array
    System.out.println("Here's an example of a one dimensional array");
    int[] array1 = { 3, 1, 5, 4, 110 };
    System.out.println(array1[2]);
    int arraySmall = array1[0];
    // Smallest value in an array
    for (int i = 1; i < array1.length; i++) {
      if (array1[i] < arraySmall) {
        arraySmall = array1[i];
      } else {
        continue;
      }
    }

    System.out.println(arraySmall);
    System.out.println("Below are the values in array1");
    for (int i = 0; i < array1.length; i++) {
      System.out.print(array1[i] + " ");
    }
    System.out.println();
    System.out.println("Which number's index location would you like to find in this array?");
    int index1 = 0;
    try {
      index1 = decision.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
    // Finding the index where a value was found
    for (int i = 0; i < array1.length; i++) {
      if (array1[i] == index1) {
        System.out.println("The value of " + index1 + " is located at " + i);
      }
    }
    int sum1 = 0;
    // Here's the sum of the array using an accumulator
    for (int i = 0; i < array1.length; i++) {
      sum1 += array1[i];
    }
    System.out.println("The sum of the values in the array is " + sum1);
    // Here's a multi-dimensional array
    int[][] array2 = { { 3, 4 }, { 2, 5 } };
    System.out
        .println("Here is the location of one value in a multi-dimensional array " + array2[0][1]);
    System.out.println("Which number's index location would you like to find?");
    int doubleArray1Index = 0;
    try {
      doubleArray1Index = decision.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
    // returning the coordinates of a certain value in a two dimensional array.
    for (int i = 0; i < array2.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        if (array2[i][j] == doubleArray1Index) {
          System.out.println("The value of " + doubleArray1Index + " is located at " + i + "," + j);
        }
      }
    }
    String[] stringArray = { "hello", "hewwo", "hewww", "aaaaa" };
    // Here's the enhanced for loop
    for (String item : stringArray) {
      System.out.println(item);
    }
    // Declaring and using an ArrayList
    ArrayList<String> names = new ArrayList<String>();
    System.out.println("How many names would you like to add?");
    int nameCount = 0;
    try {
      nameCount = decision.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
    for (int i = 0; i < nameCount; i++) {
      System.out.println("What name would you like to add?");
      String nameDecision = "";
      try {
        nameDecision = decision.next();
      } catch (Exception e) {
        System.out.println("Invalid input, try again");
      }
      names.add(nameDecision);
    }
    System.out.println("The names you have added are: ");
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }
  }

  /**
   * Provides the user with a few input activities.
   * 
   * @param decision takes User input.
   */
  public static void haveFun(Scanner decision) {
    System.out.println("What's your favorite color?");
    decision.nextLine();
    String colorChoice1 = "";
    try {
      colorChoice1 = decision.nextLine();
    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
    String colorChoice2 = favColor(colorChoice1);
    System.out.println(colorChoice2);
    System.out.println("Would you like some lucky numbers for today ^_^?");
    String luckyNumberDecision = "";
    try {
      luckyNumberDecision = decision.nextLine();
    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
    if ((luckyNumberDecision.toLowerCase()).equals("no")) {
      System.out.println("If you say so....");
    } else if ((luckyNumberDecision.toLowerCase()).equals("yes")) {
      Random luckyNumber = new Random();
      int luckyResult;
      for (int i = 1; i <= 7; i++) {
        luckyResult = 1 + luckyNumber.nextInt(100);
        if (luckyResult == 4) {
          // == returns a boolean value (true or false) when used with objects
          continue;
          // 4 is an unlucky number, so I used continue to skip it every time it was randomly
          // generated.
        }
        System.out.println(luckyResult);
      }
    } else {
      System.out.println("Invalid, try again");
    }
    System.out.println("How many times do you want to see a cow?");
    int cowInt = 0;
    try {
      cowInt = decision.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
    do {
      System.out.println("                        /;    ;\\\n"
          + "                                   __  \\\\____//\n"
          + "                                  /{_\\_/   `'\\____\n"
          + "                                  \\___   (o)  (o  }\n"
          + "       _____________________________/          :--'  \n"
          + "   ,-,'`@@@@@@@@       @@@@@@         \\_    `__\\\n"
          + "  ;:(  @@@@@@@@@        @@@             \\___(o'o)\n"
          + "  :: )  @@@@          @@@@@@        ,'@@(  `===='       \n"
          + "  :: : @@@@@:          @@@@         `@@@:\n"
          + "  :: \\  @@@@@:       @@@@@@@)    (  '@@@'\n"
          + "  ;; /\\      /`,    @@@@@@@@@\\   :@@@@@)\n"
          + "  ::/  )    {_----------------:  :~`,~~;\n"
          + " ;;'`; :   )                  :  / `; ;\n"
          + ";;;; : :   ;                  :  ;  ; :              \n"
          + "`'`' / :  :                   :  :  : :\n"
          + "    )_ \\__;      \";\"          :_ ;  \\_\\       `,','\n"
          + "    :__\\  \\    * `,'*         \\  \\  :  \\   *  8`;'*  *\n"
          + "        `^'     \\ :/           `^'  `-^-'   \\v/ :  \\/ ");
      // shout out to Bill Ames on asciiart.eu!!
      cowInt--;
    } while (cowInt > 0);
  }

  /**
   * Gives the User a response based on their input regarding their favorite color.
   * 
   * @param decisionC takes User input.
   * @return an answer regarding the User's favorite color.
   */
  public static String favColor(String decisionC) {
    String response1 = "Right Answer!";
    String response2 = ">:(";
    if ((decisionC.toLowerCase()).equals("blue") || (decisionC.toLowerCase()).equals("purple")) {
      return response1;
    } else {
      return response2;
    }
  }

  /**
   * Directory for the calculator feature.
   * 
   * @param decision takes User input.
   */
  public static void calculate(Scanner decision) {
    System.out.println("What basic operation would you like to perform?");
    System.out.println("\t 1: Addition");
    System.out.println("\t 2: Subtraction");
    System.out.println("\t 3: Division");
    System.out.println("\t 4: The remainder of a quotient");
    System.out.println("\t 5: Multiplication");
    int calChoice = 0;
    try {
      calChoice = decision.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
    switch (calChoice) {
      case 1:
        returnAddition(decision);
        break;
      case 2:
        returnSubtraction(decision);
        break;
      case 3:
        returnDivision(decision);
        break;
      case 4:
        returnRemainder(decision);
        break;
      case 5:
        returnMultiplication(decision);
        break;
      default:
        System.out.println("Invalid input, rerun and try again.");
    }
  }

  /**
   * Returns the User's age.
   * 
   * @param scanner takes User input.
   */
  public static void ageGet(Scanner scanner) {
    Date date = new Date();
    System.out.println("The current date is: " + date);
    System.out.println("Please enter the year you were born");
    int by = 0;
    try {
      by = scanner.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
    System.out.println("Please enter the month you were born");
    int bm = 0;
    try {
      bm = scanner.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
    System.out.println("Please enter the day you were born");
    int bd = 0;
    try {
      bd = scanner.nextInt();
    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
    final UserAgeNoErrors newDate2 = new UserAgeNoErrors(bd, bm, by);
    scanner.nextLine();
    String message1 = "";
    try {
      message1 = scanner.nextLine();
    } catch (Exception e) {
      System.out.println("Invalid input, try again");
    }
    UserAgeNoErrors messageNew = new UserAgeNoErrors(message1);
    System.out.println("You entered your birthday as " + UserAgeNoErrors.getBMonth() + "/"
        + UserAgeNoErrors.getBDay() + "/" + UserAgeNoErrors.getBYear());
    System.out.println(message1);
    System.out.println(newDate2);
    System.out.println(messageNew);
  }

  /**
   * Returns the sum of two numbers.
   * 
   * @param decision takes User input.
   */
  public static void returnAddition(Scanner decision) {
    // The entirety of the ^ line above is the header
    // "decision" is the parameter
    try {
      System.out.println("Please enter the first number you would like to add");
      AdditionClass.setAddNum1(decision.nextDouble());
      // ^This is an example of a method call
      System.out.println("Please enter the second number you would like to add");
      AdditionClass.setAddNum2(decision.nextDouble());
    } catch (Exception e) {
      System.out.println("Invalid Input, try again");
    }
    // ^This is kind of an example of an argument, since it's user
    // input, but it matches the data type in the method.
    System.out.println("The result is " + AdditionClass.getAddition());
  }

  /**
   * Returns the difference of two numbers.
   * 
   * @param decision takes User input.
   */
  public static void returnSubtraction(Scanner decision) {

    try {
      System.out.println("Please enter the first number you would like to subtract");
      SubtractionClass.setSubNum1(decision.nextDouble());
      System.out.println("Please enter the second number you would like to subtract");
      SubtractionClass.setSubNum2(decision.nextDouble());
    } catch (Exception e) {
      System.out.println("Invalid Input, try again");
    }
    System.out.println("The result is " + SubtractionClass.getSubtraction());
  }

  /**
   * Returns the quotient of two numbers.
   * 
   * @param decision takes User input.
   */
  public static void returnDivision(Scanner decision) {
    try {
      System.out.println("Please enter the number you would like to divide");
      DivisionClass.setDivNum1(decision.nextFloat());
      System.out.println("Please enter the number you would like to divide by");
      DivisionClass.setDivNum2(decision.nextFloat());
    } catch (Exception e) {
      System.out.println("Invalid Input, try again");
    }
    try {
      System.out.println("The result is " + DivisionClassNoErrors.getDivision());
    } catch (Exception e) {

      System.out.println("Invalid Input, try again");
    }
  }

  /**
   * Returns the remainder of two numbers.
   * 
   * @param decision takes User input.
   */
  public static void returnRemainder(Scanner decision) {
    try {
      System.out.println("Please enter the number you would like to divide");
      RemainderClass.setRemNum1(decision.nextDouble());
      System.out.println("Please enter the number you would like to divide by");
      RemainderClass.setRemNum2(decision.nextDouble());
    } catch (Exception e) {
      System.out.println("Invalid Input, try again");
    }
    System.out.println("The remainder is " + RemainderClass.getRemainder());
  }

  /**
   * Returns the product of two numbers.
   * 
   * @param decision takes User input.
   */
  public static void returnMultiplication(Scanner decision) {

    try {
      System.out.println("Please enter the first number you would like to multiply");
      MultiplicationClass.setMultNum1(decision.nextDouble());
      System.out.println("Please enter the second number you would like to multiply");
      MultiplicationClass.setMultNum2(decision.nextDouble());
    } catch (Exception e) {
      System.out.println("Invalid Input, try again");
    }
    System.out.println("The result is " + MultiplicationClass.getMultiplication());
  }
}

