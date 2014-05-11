package ctci.ch1.arraysandstrings.question6;

/**
 * Given an image represented by an NxN matrix where each pixel is 4 bytes, rotate it 90 degrees
 * 
 * Data structure: 2-d array of integers because 4 bytes = 32 bits can be represented by an integer
 * 
 * Algorithm: Given (x, y)  coordinates of a pixel,
 * 				newX = y,
 * 				newY = array.length - 1 - x
 * 
 *
 */
public class RotateImage {
	
	int[][] image = {
			{ 1, 2, 3, 4 },
			{ 5, 6, 7, 8 },
			{ 9, 10, 11, 12 },
			{ 13, 14, 15, 16 }
	};
	
	int[][] rotatedImage = new int[image.length][image[0].length];
	
	public void rotate90Degrees() {
		
		System.out.println("Original:");
		print(image);
		
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				rotatedImage[j][image.length - 1 - i] = image[i][j];
			}
		}
		
		System.out.println("\nRotated 90 degrees:");
		print(rotatedImage);
	}
	
	private void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
