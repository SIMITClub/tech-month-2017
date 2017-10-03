// import the whole java.util package
// java.util.* means the whole elements of java.util
import java.util.*;

public class methodExample3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Declare String variable, which is called as userInput
			String userInput = input("Enter your input: ");

			System.out.println("Your Input is " + userInput);
		}
		
		public static String input(String str) {
			System.out.print(str);
			
			// Create Scanner Object and call its nextLine()
			// Then return the nextLine as String.
			return new Scanner(System.in).nextLine();
		}
}
