
public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Concatenation Concept		
		String msg1 = "This is msg1";
		String msg2 = " This is msg2";
		String msg = msg1 + msg2;
		System.out.println(msg);
		
		msg = msg + " Another msg is added";
		System.out.println(msg);
		System.out.println(msg + ", It is available to add in the output\n");
		
		// Difference Concatenation & Addition Concept
		int n = 10;
		int m = 20;
		String newMsg = "The Concatenation of n and m: " + n + m;
		System.out.println(newMsg);
		
		newMsg = "The Addition of n and m: " + (n + m);
		System.out.println(newMsg);
				
		/******************************************************/
		/* String method Part */	
		String s1 = "This is String variables";	// Length: 24
		String s2 = "Java Workshop"; 			// Length: 13
		
		// Length()
		int lengthOfs1 = s1.length();
		int lengthOfs2 = s2.length();
		System.out.println("\nThe length of s1 is " + lengthOfs1);
		System.out.println("The length of s2 is " + lengthOfs2);
		
		// isEmtpy()
		String s3 = "";
		System.out.println("\nIs Emtpy in s1: " + s1.isEmpty());
		System.out.println("Is Emtpy in s3: " + s3.isEmpty());
		
		// SubString(beginIdx, endIdx), subString(beginIdx)
		String subS1 = s1.substring(8, 14);
		String subS2 = s2.substring(5);
		System.out.println("\nSubString (8, 14) in s1 is: "+ subS1);
		System.out.println("SubString (5) in s2 is : "+ subS2);
		
		// eqauls equals(string)
		System.out.println("\nIs s1 is equal with s2? " + s1.equals(s2));
		
		// IndexOf(string)
		int idxOfs1 = s1.indexOf("String");
		int idxOfs2 = s2.indexOf("Workshop");
		System.out.println("\nThe \'is\' index in s1: " + idxOfs1);
		System.out.println("The \'Workshop\' index in s2: " + idxOfs2);
		
		// Split(regular expression)
		String[] splitS = s1.split(" ");
		String word1 = splitS[0];	// This
		String word2 = splitS[1];	// is
		String word3 = splitS[2];	// String
		String word4 = splitS[3];	// variables
		System.out.println("\n" + word1 + "***" + word2 + "***" + word3 + "***" + word4);
		
		// charAt(index)
		char c1 = s1.charAt(5);
		char c2 = s1.charAt(6);
		System.out.println(c1 + c2);	// i: 105 and s: 115 in ASCII
		
		// Convert to char to String
		/*
		 * 	char c = 'a'
		 * 	String s = String.valueOf(c)	// fastest and memory efficient
		 * 	String s = "" + c				// slowest and memory inefficient
		 */
		String ss = String.valueOf(c1) + String.valueOf(c2);
		System.out.println(ss);	
		
		// Trim()
		String s4 = "   front is 3 and end is 3   ";	// length of s4: 29
		String trimOfs4 = s4.trim();
		System.out.println("\ns4 is \'" + s4 + "\' and the length of s4 is " + s4.length());
		System.out.println("trimOfs4 is \'" + trimOfs4 + "\' and the length of trimOfs4 is " + trimOfs4);
		
		// toUpperCase OR toLowerCase
		s1 = s1.toUpperCase();
		System.out.println("\n"+ s1);
		s1 = s1.toLowerCase();
		System.out.println(s1);

	}

}
