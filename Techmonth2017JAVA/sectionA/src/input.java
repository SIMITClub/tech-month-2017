// import the whole java.util package
// java.util.* means the whole elements of java.util
import java.util.*;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Scanner Object, which is called as input, with parameter System.in
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your input: ");
		
		// Declare String variable, which is called as userInput
		String userInput;
		
		// nextLine() of input: reading character including spaces until a newline character is encountered
		// Store the character typed by user into userInput String variable
		userInput = input.nextLine();

		// Print the Result of the String Variable
		System.out.println("Your Input is " + userInput);
	}
	
	
	/*Another Example for input: nextInt()
	  
	  public static void main(String[] args) {
	  
	  	// Declare String variable, which is called as userInput
	  	Scanner input = new Scanner(System.in);
	  
	  	System.out.print("Enter an any interger value: ");
	  
	  	int val;
	  
	  	// nextInt() of input: reading the integer value excluding space until a new line character is encountered
	  	// Store the integer value typed by user into val int variable
	  	val = input.nextInt();
	  
	 
	  	// print the result
	  	System.out.println("The value is " + val);
	 }
	 */
}
