package QuizGame;

//Jacob Edge

import java.security.SecureRandom;
import java.util.*;



// Eight Primitive Data Types in Java
/*
 * byte-The byte data type is an 8-bit signed two's complement integer. The byte data type can be
 * useful for saving memory in large arrays short-The short data type is a 16-bit signed two's
 * complement integer. As with byte, the same guidelines apply: you can use a short to save memory
 * in large arrays, in situations where the memory savings actually matters. 
 * int-By default, the int data type is a 32-bit signed two's complement integer. 
 * Use the Integer class to use int data type
 * as an unsigned integer long- The long data type is a 64-bit two's complement integer. Use this
 * data type when you need a range of values wider than those provided by int. 
 * float-The float data type is a single-precision 32-bit IEEE 754 floating point. 
 * This data type should never be used
 * for precise values, such as currency. 
 * double-The double data type is a double-precision 64-bit
 * IEEE 754 floating point. For decimal values, this data type is generally the default choice.
 * boolean-The boolean data type has only two possible values: true and false. Use this data type
 * for simple flags that track true/false conditions. 
 * char-The char data type is a single 16-bit
 * Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or
 * 65,535 inclusive).
 */
/*
 * Operators precedence is when operators on the same line have equal precedence. When operators of
 * equal precedence appear in the same expression, a rule must govern which is evaluated first. /All
 * binary operators except for the assignment operators are evaluated from left to right; assignment
 * operators are evaluated right to left. 
 * Inheritance Object-oriented programming allows classes to inherit commonly used 
 * state and behavior from other classes. This is done by extending the super
 * class to a sub class using the extends command. This is useful for creating one super class that
 * describes a certain group and then you can create specific sub classes from the super class that
 * go into specifics about the subgroups of the main group while allowing you to use the code that
 * was created in the super class. 
 * Polymorphism In java this refers to a sub class containing
 * differing behaviors from the main class but still having some of the same functionality of the
 * super class that it is dervied from.
 *
 */

/** 
 * This is a driver class for the Quiz game. A Quiz game about programming and items that I have
 * learned in COP 2006.
 * 
 * 
 * @author Jacob Edge
 *
 */

public class Main {

  /**
   * This is contains all the methods and code that runs the program.
   * @param args This contains the arguments of the main method.
   */
  public static void main(String[] args) {


    System.out.println("Hello and Welcome to this Quiz Game!");
    System.out.println("Is this your first time taking the quiz? Enter True or False.: ");
    Scanner scan = new Scanner(System.in);
    // The == is how something in java is made equal without using .equals or .compareTo for
    // strings.
    if (scan.nextBoolean() == true) {
      System.out.println("How many times have you taken it before? :");
      int numQuiz = scan.nextInt();
      System.out.println("You have taken the quiz: " + numQuiz + " times.");
    } else {
      System.out.println("You have only taken the quiz one time.");
    }

    // Variables are like boxes that you can put values in.
    // Scope means a variable can only be accessed in the method where it was defined.
    // When a Variable is declared with final, its value can't be modified.
    final String PLAYERNAME = "Player 1";
    final int NUMQUESTUIONS = 20;
    final int QUESPOINTS = 1;
    int pointsMax = 20;

    System.out
        .println(PLAYERNAME + " the number of questions in this quiz is " + NUMQUESTUIONS + ".");
    System.out.println(
        "Each question is worth " + QUESPOINTS + " points for a total of " + pointsMax + ".");



    String q1 = "What is a Class?\n" + "(a)Object\n(b)Blueprint\n";

    String q2 = "An object is like an?\n" + "(a)Instance\n(b)Blueprint\n(c)";

    String q3 =
        "How many primitve Data Types are in Java?\n" + "(a)eight\n(b)nine\n(c)seven\n(d)ten";

    String q4 =
        "Can you change the Final variable after it is intialized?\n" + "(a)True\n(b)False\n";

    String q5 = "Can you concat a String with the +?\n" + "(a)True\n(b)False\n";

    String q6 = "How do you create a substring in Java?\n"
        + "(a)boolean contains\n(b)String[] split\n(c)String replace\n(d)String substring\n";

    String q7 = "Do you have to import the random class in Java?\n " + "(a)True\n(b)False\n";

    String q8 = "Do you have to import the Math class in Java?\n" + "(a)True\n(b)False\n ";

    String q9 = "What does the Math.abs command do?\n"
        + "(a)rounds the number down\n(b)rounds the number up\n(c)absoulte value\n"
        + "(d)Finds the square root\n ";

    String q10 = "What does the Math.floor command do\n"
        + "(a)rounds the number down\n(b)rounds the number up\n(c)absoulte value\n"
        + "(d)Finds the square root\n ";

    String q11 = "What does the Math.sqrt command do\n"
        + "(a)rounds the number down\n(b)rounds the number up\n(c)absoulte value\n"
        + "(d)Finds the square root\n ";

    String q12 = "What does the Math.pow command do\n"
        + "(a)Finds the power of the first number to the second number in the ()\n"
        + "(b)rounds the number up\n"
        + "(c)rounds the number down\n(d)Finds the square root\n ";

    String q13 = "What does the operator ! do/n"
        + "(a)Increment\n(b)inverts the value of a boolean\n(c)negates an expression\n"
        + "(d)Finds the Remainder\n ";

    String q14 = "What does the operator ++ do/n"
        + "(a)Increment\n(b)inverts the value of a boolean\n(c)negates an expression\n"
        + "(d)Finds the Remainder\n";

    String q15 = "The teneray operator is similar to what loop?\n"
        + "(a)While\n(b)For\n(c)if/else\n(d)do..while\n";

    String q16 =
        "Is the second operand in Condiational-AND always evaluated?\n" + "(a)True\n(b)False\n";

    String q17 =
        "Is the second operand in Condiational-OR always evaluated?\n" + "(a)True\n(b)False\n";

    String q18 = "Does the For loop always need two semi-colon?\n" + "(a)False\n(b)True\n";

    String q19 =
        "Does the While Loop kepp going until the condtion is false?\n" + "(a)False\n(b)True\n";

    String q20 =
        "Does the do while loop execute in the Do portion or the While portion of the loop?\n"
            + "(a)Do\n(b)While\n";



    Question[] questions = {new Question(q1, "b"), new Question(q2, "a"), new Question(q3, "a"),
        new Question(q4, "b"), new Question(q5, "a"), new Question(q6, "d"), new Question(q7, "b"),
        new Question(q8, "a"), new Question(q9, "c"), new Question(q10, "a"),
        new Question(q11, "d"), new Question(q12, "a"), new Question(q13, "b"),
        new Question(q14, "a"), new Question(q15, "c"), new Question(q16, "a"),
        new Question(q17, "a"), new Question(q18, "b"), new Question(q19, "b"),
        new Question(q20, "a")

    };
    // This statement calls the the takeQuiz method with the argument of the questions array.
    takeQuiz(questions);

    // This section of code implements a random number generator using a while loop
    Random randNum = new Random();
    int i = 0;
    while (i < 15) {
      System.out.println(randNum.nextInt(100));
      i++;
    }
    // This code section uses a do while loop to find the sum of user entered numbers that are
    // positive.
    int sum = 0;
    int number = 0;
    Scanner numInput = new Scanner(System.in);
    do {
      sum += number;
      System.out.println("Enter a number: ");
      number = numInput.nextInt();

    } while (sum >= 0);
    System.out.println("The sum is: " + sum);
    // This portion of code makes use of the ternary operator
    int value1 = 5;
    String message =
        value1 >= 10 ? "Number is greater than 10" : "Number is less than or equal to 10";
    System.out.println(message);
    // This portion of code makes use of a switch statement.
    System.out.println("This switch prints out speific quesitons from the questions array.");
    int value4 = 3;
    switch (value4) {
      case 1:
        System.out.println(q1);
        break;
      case 2:
        System.out.println(q2);
        break;
      case 3:
        System.out.println(q3);
        break;
      case 4:
        System.out.println(q4);
        break;
      case 5:
        System.out.println(q5);
        break;
      default:
        System.out.println("No output");
    }
    //
    double newDouble = 9.59;
    int newInt = (int) newDouble;
    System.out.println("This code shows a double before it is casted to an int " + newDouble + ".");
    System.out.println("This code shows the use of casting a double to an int " + newInt + ".");
    // This portion of code compares the length of question 1 to question 4.
    System.out
        .println("This code compares the length of Question to Question 4 " + q1.compareTo(q4));
    //
    int loop1 = 0;
    while (loop1 < 10) {
      if (loop1 == 6) {
        loop1++;
        continue;
      }
      System.out.println(loop1);
      loop1++;
    }
    //
    int overLoadInt = addMethod(5, 3);

    double overLoadDouble = addMethod(2.67, 4.78);

    System.out.println("Example of an method overload using int: " + overLoadInt);

    System.out.println("Example of an method overload using Double: " + overLoadDouble);

    //
    int[] oneDimeArray;

    oneDimeArray = new int[10];

    oneDimeArray[0] = 5;

    oneDimeArray[1] = 10;

    oneDimeArray[2] = 15;

    oneDimeArray[3] = 20;

    oneDimeArray[4] = 25;

    oneDimeArray[5] = 30;

    oneDimeArray[6] = 35;

    oneDimeArray[7] = 40;

    oneDimeArray[8] = 45;

    oneDimeArray[9] = 50;


    System.out.println("Smallest value of the Array: " + getSmallest(oneDimeArray, 10));

    // This section of code sums the oneDimeArray using an enhanced for loop.
    int arraySum = 0;
    for (int numArray : oneDimeArray) {
      arraySum += numArray;
    }

    System.out.println("The sum of this Array is: " + arraySum);
    // This code shows a try catch block in a while loop that would print an exception if an integer
    // is not inputed.
    Scanner tryCatch = new Scanner(System.in);
    System.out.println("Pleas input an integer: ");
    boolean gottenGoodInput = false;
    while (gottenGoodInput == false) {

      try {
        int input = tryCatch.nextInt();
        System.out.println(input);
        gottenGoodInput = true;
      } catch (InputMismatchException exception) {
        System.out.println("Try Again");
        tryCatch.nextLine();
      }
    }

    // This code Declares, instantiates, initializes and uses multi-dimensional array.
    int arr[][] = 
      {
        {4, 3}, {7, 8}, {9, 4}
      };

    System.out.println("This prints out array arr: " + arr[2][1]);
    // This portion of code makes use of an Array list of key terms in Java and gets the term
    // located in index 1.
    ArrayList<String> keyTerms = new ArrayList<String>();
    keyTerms.add("Inheritance ");
    keyTerms.add("Polymorphism");
    keyTerms.add("Methods");
    keyTerms.add("Classes");
    keyTerms.add("Constructor");
    keyTerms.add("Header");
    keyTerms.add("Parameter");
    keyTerms.add("Loops");
    keyTerms.add("Conditional Operators");
    keyTerms.add("Relational Operators ");
    keyTerms.add("Switch");

    System.out.println("This code prints out a key term from an Array List: " + keyTerms.get(1));



  }

  // Both int x and y are parameter
  /**
   * @param x Adds int x to the argument 
   * @param y Adds int y to the argument
   * @return This returns the sum of x and y
   */
  public static int addMethod(int x, int y) {
    return x + y;
  }

  /**
   * @param x Add double x to the argument
   * @param y Adds double y to the argument
   * @return This returns the double sum of x and y
   */
  public static double addMethod(double x, double y) {
    return x + y;
  }

  /**
   * @param oneDimeArray This is the array variable
   * @param total This is the total value of the array
   * @return This return the smallest value of the array.
   */
  public static int getSmallest(int[] oneDimeArray, int total) {
    Arrays.sort(oneDimeArray);
    return oneDimeArray[0];
  }

  // this following line of code is a method header
  /**
   * This code contains the loop for the questions array.
   * @param questions The array questions is called.
   */
  public static void takeQuiz(Question[] questions) {
    int points = 0;
    Scanner quesAnswer = new Scanner(System.in);
    // This Following code shows a For loop formatted correctly.
    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[i].getPrompt());
      String answer = quesAnswer.nextLine();

      if (answer.equals(questions[i].getAnswer())) {
        points++;
      }
    }
    System.out.println("You achieved " + points + "");

  }


}
