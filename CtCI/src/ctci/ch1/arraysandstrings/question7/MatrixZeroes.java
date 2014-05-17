package ctci.ch1.arraysandstrings.question7;

public class MatrixZeroes {

	private int[][] matrix = {
			{ 1, 2, 0, 4, 0 },
			{ 5, 6, 7, 8, 7 },
			{ 9, 0, 11, 12, 7 },
			{ 13, 14, 15, 16, 7 }
	};
	
	public void applyZeroes() {
		System.out.println("Original:");
		print(matrix);
		
		boolean[] rowsTo0 = new boolean[matrix.length];
		boolean[] columnsTo0 = new boolean[matrix[0].length];
		
		// Get rows and columns to zero out
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					rowsTo0[i] = true;
					columnsTo0[j] = true;
				}
			}
		}
		
		// Zero out the rows
		for (int i = 0; i < rowsTo0.length; i++) {
			if (rowsTo0[i]) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		// Zero out the columns
		for (int i = 0; i < columnsTo0.length; i++) {
			if (columnsTo0[i]) {
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][i] = 0;
				}
			}
		}
		
		System.out.println("\nZeroed out:");
		print(matrix);
	}
	
	private void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
}
