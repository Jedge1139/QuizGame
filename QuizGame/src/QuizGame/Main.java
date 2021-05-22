package QuizGame;
//Jacob Edge
//A Quiz game about programming and items that I have learned in COP 2006.

//Eight Primitive Data Types in Java
/*Byte-The byte data type is an 8-bit signed two's complement integer. The byte data type can be useful for saving memory in large arrays
*Short-The short data type is a 16-bit signed two's complement integer.  As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.
*Int-By default, the int data type is a 32-bit signed two's complement integer.Use the Integer class to use int data type as an unsigned integer
*Long- The long data type is a 64-bit two's complement integer.  Use this data type when you need a range of values wider than those provided by int.
*Float-The float data type is a single-precision 32-bit IEEE 754 floating point. This data type should never be used for precise values, such as currency.
*Double-The double data type is a double-precision 64-bit IEEE 754 floating point. For decimal values, this data type is generally the default choice.
*Boolean-The boolean data type has only two possible values: true and false. Use this data type for simple flags that track true/false conditions.
*Char-The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
*/



public class Main {

	public static void main(String[] args) {
		System.out.println("Hello and Welcome to this Quiz Game!");
		boolean moreThanOnePlayer = false;
		System.out.println("Is there more than one player " + moreThanOnePlayer+ "." );
		
		//Variables are like boxes that you can put values in.
		//Scope means a variable can only be accessed in the method where it was defined.
		//When a Variable is declared with final, its value can't be modified. 
		final String playerName = "Player 1";
		final int numQuestions = 20;
		double quesPoints = 1.5;
		int pointsMax = 30;
		
		System.out.println(playerName + " the number of questions in this quiz is " + numQuestions+"." );
		System.out.println("Each question is worth " + quesPoints + " points for a total of " + pointsMax+"." );
		
		
		
		
		

	}

}
