
public class array2D {
	public static void main(String[] args) {
		
		// Declare 2D array
		final int ROWS = 5;
		final int COLS = 5;
		char[][] matrix = new char[ROWS][COLS];
		
		// element for matrix
		char element = 'a';
		
		// Initialize all Matrix elements in 2D Array;
		for(int i=0; i<ROWS; i++){
			for(int j=0; j<COLS; j++){
				
				matrix[i][j] = element;
				
				element += 1;
			}
		}
				
		// Access to 2D Array
		for(int i=0; i<ROWS; i++) {
			for(int j=0; j<COLS; j++) {
				System.out.print(matrix[i][j] + "\t");				
			}
			System.out.println();
		}
	}

	
}
