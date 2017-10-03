
public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Sample of IF statement
		int num = 10;
		
		// without bracket: if line is only 1 line, then can use this format
		if(num == 10)
			System.out.println("num is same as 10");
		
		// with bracket: execute the lines located in the brackets
		if(num > 0) {
			System.out.println("num is positive number");
		}
		
		System.out.println("==========================");
		
		// 2. Sample of IF ELSE statement
		int val = -10;
		
		if(val > 0)
			System.out.println("val is positive number");
		else
			System.out.println("val is negative number");
		
		System.out.println("==========================");
		
		
		// 3. Sample of Nested IF
		int result = 80;
		if(result >= 85 && result <=100)
			System.out.println("Your result is High Distinction");
		else if(result >= 75 && result < 85)
			System.out.println("Your result is Distinction");
		else if(result >= 65 && result < 75)
			System.out.println("Your result is Credit");
		else if(result >= 50 && result < 65)
			System.out.println("Your result is Pass");
		else
			System.out.println("You Fail in Exam");
		
		System.out.println("==========================");
		
		// 4. Sample of IF with boolean condition
		boolean valid = true;
		
		if(valid)
			System.out.println("This condition is valid condition");
		
		System.out.println("==========================");
		
		// 5. Sample of IF with boolean condition
		boolean found = false;
		
		if(!found)
			System.out.println("We cannot find your search");
		
		System.out.println("==========================");
		
		// 6. Sample of Switch
		int code = 3;
		String desc;
		
		switch(code) {
			case 0: desc = "High Distinction";
					break;
			case 1:	desc = "Distinction";
					break;
			case 2:	desc = "Credit";
					break;
			case 3:	desc = "Pass";
					break;
			default:desc = "Fail";
		}
		
		System.out.println(desc);
	}
}
