// My name is Darian Hernandez and I'm gonna become the best hokage ever, believe it!
// This program serves as an example of what I've learned in COP2006
import java.util.Scanner;
import java.util.Random;

public class Main {
  // this is a header
  // public is an access modifier
  // void is the return type
  public static void main(String[] args) {
    int continueProgram = 1;
    while (continueProgram == 1) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to my Integration project!");
      System.out.println("Would you like to:");
      System.out.println("\t 1: See some explanations");
      System.out.println("\t 2: Have some fun");
      System.out.println("\t 3: Use a calculator");
      System.out.println("\t 4: Find out how old you are");
      int menuChoice = scanner.nextInt();
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
        default:
          System.out.println("Invalid input, try again");
          /*
           * Operator precedence: Postfix (ex: expr++) Unary (ex: ++expr) Multiplicative: * / %
           * Additive: + - Shift: <<, etc Relational: <, etc Equality: == etc Bitwise and: & Bitwise
           * exclusive or: ^ Bitwise inclusive or: | Logical and: && Logical or: || Ternary: ?:
           * Assignment: = etc
           */
          /*
           * A byte is a data type that is composed of 8 bits signed two's complement integer. Min
           * value is -128 and a maximum of 127 (inclusive). Useful for saving memory in large
           * arrays, also can be used in place of int. Short data type is 16 bit signed two's
           * complement integer, min value of -32768, and a maximum of 32767 inclusive. Same
           * guidelines with byte Int is a 32 bit same stuff above. min value of -2^31, max value of
           * (2^31)-1.In java se 8 and higher the int type can be used to rep an unsigned 32 bit
           * integer, which has a min value of 0 and max value of (2^32)-1. Integer class is used to
           * use int data type as an unsigned integer. Static methods ex: compareUnsigned,
           * divideUnsigned, have been added to the integer class to support math stuff down da line
           * Long data type is 64 bit, same stuff as above. Signed long has a min value of -2^63,
           * max value of 2^63)-1. Java se 8 and later, long data type reps unsigned 64 bit long,
           * min value 0, max value of 2^64)-1, Use the data type when you need a range of values
           * wider than int's. Long class also contains methods like compareUnsigned,
           * divideUnsigned. Float data type is a single precision 32 bit IEEE 754 floating point.
           * Very big range of values, use a float if you need to save large amounts of memory,
           * should never be used for precise values ex currency. For that use java.math.BigDecimal
           * class. Double data type is a double precision 64 bit IEEE 754 floating point. Range of
           * values is very big, decimal values, this data type is used. Never used for
           * currency/precise values. Boolean data type has only two values: true or false. Used for
           * simple flags that track t/f, only reps one bit of info, no real size Char data type is
           * single 16 bit unicode character. Min val of '\u0000' or just 0 and a max value of
           * '\uffff' (or 65535 inclusive) Default values: Byte:0 Short:0 Int:0 Long:0L Float:0.0f
           * Double:0.0d Char:'\u0000' String (any object):null Boolean:false
           */
          System.out.println("Press 1 to continue or 2 to quit.");
          continueProgram = scanner.nextInt();
      }
    }
  }

  public static void showExample(Scanner decision) {
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
    int breakExample = decision.nextInt();
    for (int i = 10; i > 0; i--) {
      if (i == breakExample) {
        break;
        // break is used to stop a loop in code
      }
      System.out.println(i);
    }
  }

  public static void haveFun(Scanner decision) {
    System.out.println("What's your favorite color?");
    decision.nextLine();
    String colorChoice1 = decision.nextLine();
    String colorChoice2 = favColor(colorChoice1);
    System.out.println(colorChoice2);
    System.out.println("Would you like some lucky numbers for today ^_^?");
    String luckyNumberDecision = decision.nextLine();
    if ((luckyNumberDecision.toLowerCase()).equals("no")) {
      System.out.println("If you say so....");
    } else if ((luckyNumberDecision.toLowerCase()).equals("yes")) {
      Random luckyNumber = new Random();
      int luckyResult;
      for (int i = 1; i <= 7; i++) {
        luckyResult = 1 + luckyNumber.nextInt(100);
        while (luckyResult == 4) {
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
    int cowInt = decision.nextInt();
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

  public static String favColor(String decisionC) {
    String response1 = "Right Answer!";
    String response2 = ">:(";
    if ((decisionC.toLowerCase()).equals("blue") || (decisionC.toLowerCase()).equals("purple")) {
      return response1;
    } else {
      return response2;
    }
  }

  public static void calculate(Scanner decision) {
    System.out.println("What basic operation would you like to perform?");
    System.out.println("\t 1: Addition");
    System.out.println("\t 2: Subtraction");
    System.out.println("\t 3: Division");
    System.out.println("\t 4: The remainder of a quotient");
    System.out.println("\t 5: Multiplication");
    int calChoice = decision.nextInt();
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

  public static void ageGet(Scanner scanner) {
    System.out.println("Please enter the current year");
    int y = scanner.nextInt();
    System.out.println("Please enter the current month");
    int m = scanner.nextInt();
    System.out.println("Please enter the current day");
    int d = scanner.nextInt();
    UserAge newDate1 = new UserAge(d, m, y, 0, 0, 0);
    System.out.println("The date you have entered is " + UserAge.getMonth() + "/" + UserAge.getDay() + "/" + UserAge.getYear());
    System.out.println("Please enter the year you were born");
    int by = scanner.nextInt();
    System.out.println("Please enter the month you were born");
    int bm = scanner.nextInt();
    System.out.println("Please enter the day you were born");
    int bd = scanner.nextInt();
    UserAge newDate2 = new UserAge(d, m, y, bd, bm, by);
    System.out.println("You entered your birthday as " + UserAge.getBMonth() + "/" + UserAge.getBDay() + "/" + UserAge.getBYear());
    int fy = (m >= bm)?(y-by):((y-by)-1);
    //nevermind loalkj
    
  }

  public static void returnAddition(Scanner decision) {
    // The entirety of the ^ line above is the header
    // "decision" is the parameter
    AdditionClass additionM1 = new AdditionClass();
    AdditionClass additionM2 = new AdditionClass();
    System.out.println("Please enter the first number you would like to add");
    additionM1.setAddNum1(decision.nextDouble());
    // ^This is an example of a method call
    System.out.println("Please enter the second number you would like to add");
    additionM2.setAddNum2(decision.nextDouble());
    // ^This is kind of an example of an argument, since it's user
    // input, but it matches the data type in the method.
    System.out.println("The result is " + AdditionClass.getAddition());
  }

  public static void returnSubtraction(Scanner decision) {
    SubtractionClass subtractionM1 = new SubtractionClass();
    SubtractionClass subtractionM2 = new SubtractionClass();
    System.out.println("Please enter the first number you would like to subtract");
    subtractionM1.setSubNum1(decision.nextDouble());
    System.out.println("Please enter the second number you would like to subtract");
    subtractionM2.setSubNum2(decision.nextDouble());
    System.out.println("The result is " + SubtractionClass.getSubtraction());
  }

  public static void returnDivision(Scanner decision) {
    DivisionClass divisionM1 = new DivisionClass();
    DivisionClass divisionM2 = new DivisionClass();
    System.out.println("Please enter the number you would like to divide");
    divisionM1.setDivNum1(decision.nextDouble());
    System.out.println("Please enter the number you would like to divide by");
    divisionM2.setDivNum2(decision.nextDouble());
    System.out.println("The result is " + DivisionClass.getDivision());
  }

  public static void returnRemainder(Scanner decision) {
    RemainderClass remainderM1 = new RemainderClass();
    RemainderClass remainderM2 = new RemainderClass();
    System.out.println("Please enter the number you would like to divide");
    remainderM1.setRemNum1(decision.nextDouble());
    System.out.println("Please enter the number you would like to divide by");
    remainderM2.setRemNum2(decision.nextDouble());
    System.out.println("The remainder is " + RemainderClass.getRemainder());
  }

  public static void returnMultiplication(Scanner decision) {
    MultiplicationClass multiplicationM1 = new MultiplicationClass();
    MultiplicationClass multiplicationM2 = new MultiplicationClass();
    System.out.println("Please enter the first number you would like to multiply");
    multiplicationM1.setMultNum1(decision.nextDouble());
    System.out.println("Please enter the second number you would like to multiply");
    multiplicationM2.setMultNum2(decision.nextDouble());
    System.out.println("The result is " + MultiplicationClass.getMultiplication());
  }
}
