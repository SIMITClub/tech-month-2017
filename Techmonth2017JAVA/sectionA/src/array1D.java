
public class array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring and Creating 1st Array;
		int[] result = new int[5];
		
		// Initializing 1st Array: Method 1.
		result[0] = 55;
		result[1] = 77;
		result[2] = 40;
		result[3] = 39;
		result[4] = 89;
		
		// Accessing 1st Array
		System.out.println("The length of first array is " + result.length);
		System.out.println("3rd result is " + result[1]);
		System.out.println("5th result is " +result[4]);
		
		
		// Declaring, Creating and Initializing 2nd Array: Method 2.
		int[] time = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		// Accessing 2nd Array
		for(int i=0; i<time.length; i++)
			System.out.println("Current Time is " + time[i]);

	}

}
