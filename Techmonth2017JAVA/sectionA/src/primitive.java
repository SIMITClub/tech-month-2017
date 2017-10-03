
public class primitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare
		int valInt = 100;
		char valChar = 'Z';
		boolean valBool = false;
		double valDob = 777;
		
		System.out.println(">> Before Modification");
		System.out.println("Integer Value: " + valInt);
		System.out.println("Character Value: " + valChar);
		System.out.println("Boolean Value: " + valBool);
		System.out.println("Double Value: " + valDob);
		
		// Modify the Values
		valInt = 999;
		valChar = 'D';
		valBool = true;
		valDob = 1111.2223;
		
		System.out.println();
		System.out.println(">> After Modification");
		System.out.println("Integer Value: " + valInt);
		System.out.println("Character Value: " + valChar);
		System.out.println("Boolean Value: " + valBool);
		System.out.println("Double Value: " + valDob);		

	}
}
