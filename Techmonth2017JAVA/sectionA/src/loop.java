
public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sample 1. For Loop
		for(int i=0; i<15; i++)
			System.out.println("count value is " + i);
		
		System.out.println("=================================");
		
		// Sample 2. Nested For Loop
		for(int i=0; i<5; i++) {
			System.out.println(">> Row is " + i);
			for(int j=0; j<5; j++) {
				System.out.println("col is " + j);
			}
		}
		
		System.out.println("=================================");
		
		// Sample 3. While Loop
		int count = 0;
		while(count < 15) {
			System.out.println("Count is "+ count + " and smaller than 15");
			count++;
		}
		
		System.out.println("=================================");
		
		// Sample 4. do~While Loop
		int num = 100;
		do {
			System.out.println("num is " + num);
			num/=2;
		}while(num!=0);
		
		System.out.println("=================================");
		
	}

}
