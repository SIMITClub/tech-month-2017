

public class methodExample2 {
	
	public static void main(String[] args)
	{
	    int num1 = 10;
	    int num2 = 20;

	    System.out.println("Before Swap method | num1: " + num1 + " and num2: " + num2);
	    num1 = swap(num2, num2 = num1);
	    System.out.println("After Swap method | num1: " + num1 + " and num2: " + num2);
	}
	
	
	public static int swap(int swappedNum1, int swappedNum2)
	{
	    return swappedNum1;
	}
}
