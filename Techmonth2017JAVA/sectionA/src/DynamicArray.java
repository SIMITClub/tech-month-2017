import java.util.ArrayList;

public class DynamicArray {
	
	public static void main(String[] args) {
		
		// Declaring and Creating ArrayList
		ArrayList<Integer> dynamic = new ArrayList<Integer>();
		
		// Initializing ArrayList
		for(int i=0; i<5; i++)
			dynamic.add(i);
		
		
		/* Accessing ArrayList's features */
		// size(): return the number of elements in ArrayList
		System.out.println("ArrayList size is " + dynamic.size());
		
		// isEmpty(): return true if the arraylist doesn't have any elements. thus size() is 0
		// Else return false
		System.out.println("is ArrayList empty?: " + dynamic.isEmpty());
		
		// contains(element): return true if the arraylist has the element parameters
		// Else return false;
		System.out.println("Does ArrayList contains element 5?: " + dynamic.contains(5));
		System.out.println("Does ArrayList contains element 100?: " + dynamic.contains(100));
		
		// get(index): return the element located in index parameters.
		// the available index range is 0 to the size of ArrayList-1
		System.out.println("the 2nd element in ArrayList is " + dynamic.get(1));
		System.out.println("=================================");

		System.out.println("Before add elements into ArrayList: " + dynamic);
		
		// Add(index, element) Add element 100 into the index 0
		dynamic.add(0, 100);
		// Add(element): Add element 999 into ArrayList: add element into the end automatically
		dynamic.add(999);
		
		System.out.println("After add elements into Array: " + dynamic);
		System.out.println("=================================");
		
		System.out.println("Before remove 2nd element from ArrayList: " + dynamic);
		
		// remove(index) Remove element located in index parameters
		dynamic.remove(1);
		System.out.println("After remove 2nd element from ArrayList: " + dynamic);
		System.out.println("=================================");
		System.out.println("Before clear the ArrayList: " + dynamic);
		
		// clear(): remove the whole elements in ArrayList
		dynamic.clear();
		System.out.println("After clear the ArrayList: " + dynamic);

	}
	
}
