

public class methodExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Before Swap method | num1: " + num1 + " and num2: " + num2);
		swap(num1, num2);
		System.out.println("After Swap method | num1: " + num1 + " and num2: " + num2);

	}
	
	public static void swap(int num1, int num2) {
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println("After Swap in Method | num1: " + num1 + " and num2: " + num2);
	}

}
