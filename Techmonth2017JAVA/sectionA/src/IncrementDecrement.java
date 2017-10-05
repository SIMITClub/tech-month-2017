
public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valInc = 5;
		
		// Post/Pre Increment
		++valInc;
		System.out.println(valInc++);
		valInc++;
		valInc++;
		valInc++;
		System.out.println(++valInc);
		
		System.out.println("--------------------------------");
		
		// Post/Pre Decrement
		int valDec = 99;
		System.out.println(valDec--);
		valDec--;
		System.out.println(--valDec);

	}

}
