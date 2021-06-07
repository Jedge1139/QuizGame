package QuizGame;

import java.util.*;
import java.util.Random;
import java.lang.Math;

//Jacob Edge
//A Quiz game about programming and items that I have learned in COP 2006.

//Eight Primitive Data Types in Java
/*byte-The byte data type is an 8-bit signed two's complement integer. The byte data type can be useful for saving memory in large arrays
*short-The short data type is a 16-bit signed two's complement integer.  As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.
*int-By default, the int data type is a 32-bit signed two's complement integer.Use the Integer class to use int data type as an unsigned integer
*long- The long data type is a 64-bit two's complement integer.  Use this data type when you need a range of values wider than those provided by int.
*float-The float data type is a single-precision 32-bit IEEE 754 floating point. This data type should never be used for precise values, such as currency.
*double-The double data type is a double-precision 64-bit IEEE 754 floating point. For decimal values, this data type is generally the default choice.
*boolean-The boolean data type has only two possible values: true and false. Use this data type for simple flags that track true/false conditions.
*char-The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
*/
/*Operators precedence is when operators on the same line have equal precedence. When operators of equal precedence appear in the same expression, a rule must govern which is evaluated first.
/All binary operators except for the assignment operators are evaluated from left to right; assignment operators are evaluated right to left.
*/
public class Main {
	
	public static void main(String[] args) {
		
		
		System.out.println("Hello and Welcome to this Quiz Game!");
		System.out.println("Is this your first time taking the quiz? : ");
		Scanner scan = new Scanner(System.in);
		//The == is how something in java is made equal without using .equals or .compareTo for strings.
		if(scan.nextBoolean()==true) {
			System.out.println("How many times have you taken it before? :");
			int numQuiz = scan.nextInt();
			System.out.println("You have taken the quiz: " +numQuiz + " times.");
		}
		else {
			System.out.println("You have only taken the quiz one time.");
		}
		
		//Variables are like boxes that you can put values in.
		//Scope means a variable can only be accessed in the method where it was defined.
		//When a Variable is declared with final, its value can't be modified. 
		final String PLAYERNAME = "Player 1";
		final int NUMQUESTUIONS = 20;
		final int QUESPOINTS = 1;
		int pointsMax = 20;
		
		System.out.println(PLAYERNAME + " the number of questions in this quiz is " + NUMQUESTUIONS+"." );
		System.out.println("Each question is worth " + QUESPOINTS + " points for a total of " + pointsMax+"." );
		
	
		
		String q1 = "What is a Class?\n" + "(a)Object\n(b)Blueprint\n";
		
		String q2 = "An object is like an?\n" + "(a)Instance\n(b)Blueprint\n(c)";
		
		String q3 = "How many primitve Data Types are in Java?\n" + "(a)eight\n(b)nine\n(c)seven\n(d)ten";
		
		String q4 = "Can you change the Final variable after it is intialized?\n" + "(a)True\n(b)False\n";
		
		String q5 = "Can you concat a String with the +?\n" + "(a)True\n(b)False\n";
		
		String q6 =  "How do you create a substring in Java?\n" + "(a)boolean contains\n(b)String[] split\n(c)String replace\n(d)String substring\n";
		
		String q7 = "Do you have to import the random class in Java?\n " + "(a)True\n(b)False\n";
		
		String q8 = "Do you have to import the Math class in Java?\n" + "(a)True\n(b)False\n ";
		
		String q9 = "What does the Math.abs command do?\n" + "(a)rounds the number down\n(b)rounds the number up\n(c)absoulte value\n(d)Finds the square root\n ";
		
		String q10 = "What does the Math.floor command do\n" + "(a)rounds the number down\n(b)rounds the number up\n(c)absoulte value\n(d)Finds the square root\n ";
		
		String q11 = "What does the Math.sqrt command do\n" + "(a)rounds the number down\n(b)rounds the number up\n(c)absoulte value\n(d)Finds the square root\n ";
		
		String q12 = "What does the Math.pow command do\n" + "(a)Finds the power of the first number to the second number in the ()\n(b)rounds the number up\n(c)rounds the number down\n(d)Finds the square root\n ";
		
		String q13 = "What does the operator ! do/n" + "(a)Increment\n(b)inverts the value of a boolean\n(c)negates an expression\n(d)Finds the Remainder\n ";
		
		String q14 = "What does the operator ++ do/n" + "(a)Increment\n(b)inverts the value of a boolean\n(c)negates an expression\n(d)Finds the Remainder\n";
		
		String q15 = "The teneray operator is similar to what loop?\n" + "(a)While\n(b)For\n(c)if/else\n(d)do..while\n";
		
		String q16 = "Is the second operand in Condiational-AND always evaluated?\n" + "(a)True\n(b)False\n";
		
		String q17 = "Is the second operand in Condiational-OR always evaluated?\n" + "(a)True\n(b)False\n";
		
		String q18 = "Does the For loop always need two semi-colon?\n" + "(a)False\n(b)True\n";
		
		String q19 = "Does the While Loop kepp going until the condtion is false?\n" + "(a)False\n(b)True\n" ;
		
		String q20 = "Does the do while loop execute in the Do portion or the While portion of the loop?\n" + "(a)Do\n(b)While\n";
		
		
		
		Question [] questions = {
			new Question(q1, "b"),
			new Question(q2, "a"),
			new Question(q3, "a"),
			new Question(q4, "b"),
			new Question(q5, "a"),
			new Question(q6, "d"),
			new Question(q7, "b"),
			new Question(q8, "a"),
			new Question(q9, "c"),
			new Question(q10, "a"),
			new Question(q11, "d"),
			new Question(q12, "a"),
			new Question(q13, "b"),
			new Question(q14, "a"),
			new Question(q15, "c"),
			new Question(q16, "a"),
			new Question(q17, "a"),
			new Question(q18, "b"),
			new Question(q19, "b"),
			new Question(q20, "a")
			
		};
		//This statement calls the the takeQuiz method with the argument of the questions array.
		takeQuiz(questions);
		
		//This section of code implements a random number generator using a while loop  
		Random randNum = new Random();
		int i = 0;
		while(i<15) {
			System.out.println(randNum.nextInt(100));
			i++;
		}
		//This code section uses a do while loop to find the sum of user entered numbers that are positive.
		int sum = 0;
		int number = 0;
		Scanner numInput = new Scanner(System.in);
		 do {
			 sum += number;
			 System.out.println("Enter a number: ");
			 number = numInput.nextInt();
			
			 
		 }
		while(sum >= 0);
		 System.out.println("The sum is: " + sum);
	numInput.close();		
	//This portion of code makes use of the ternary operator
	int value1 = 5;
	String message =value1 >= 10 ?"Number is greater than 10":"Number is less than or equal to 10"; 
	System.out.println(message);
	
	
	}
	//this following line of code is a method header 
	public static void takeQuiz(Question [] questions) {
		int points = 0;
		Scanner quesAnswer = new Scanner(System.in);
		//This Following code shows a For loop formatted correctly. 
		for(int i = 0;i <questions.length;i++) {
			System.out.println(questions[i].prompt);
			String answer = quesAnswer.nextLine();
			
			if(answer.equals(questions[i].answer)) {
				points++;
			}
		}
		System.out.println("You achieved " + points + "");
		
	}
	

}
