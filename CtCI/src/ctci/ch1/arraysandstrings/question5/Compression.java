package ctci.ch1.arraysandstrings.question5;

import java.util.Arrays;

public class Compression {
	
	private String string;
	private char[] contents;
	
	public Compression(String string) {
		this.string = string;
		contents = string.toCharArray();
	}

	/*
	 * This loops through the contents array twice, an array of contents' unique non-sequential characters once,
	 * and once more through an array of character counts to create an array of characters followed by their counts.
	 * 
	 * Could be more simply implemented by using a StringBuffer, but using arrays only in the spirit of Ch. 1. 
	 */
	public String compress() {
		
		// Can we even compress?
		int compressionOpportunityCount = compressionOpportunityCount();
		
		if (!isCompressible(compressionOpportunityCount)) {
			return string;
		}
		
		// We can compress, setup the compressed array
		// 1. An array to hold characters
		char[] characters = new char[compressionOpportunityCount];
		
		// 2. An array to hold character counts
		int[] counts = new int[compressionOpportunityCount];
		
		// 3. An array to merge the values
		char[] compressed;	// Length to be determined once we have character and count lengths
		
		// Put "to-compress" characters in characters array
		int j = 0;
		for (int i = 0; i < contents.length; i++) {
			if (i+1 != contents.length && contents[i] != contents[i+1]) {	// The next char is different
				characters[j] = contents[i];
				j++;
			}
		}
		// Don't forget the very last character too
		characters[characters.length-1] = contents[contents.length-1];
		System.out.printf("Characters to compress: %s\n", Arrays.toString(characters));
		
		// Compute the compression counts
		int count = 1;
		int k = 0;
		for (int i = 0; i < contents.length; i++) {
			if (i+1 != contents.length && contents[i] != contents[i+1]) {	// The next char is different
				// Save and reset the count
				counts[k] = count;
				count = 1;
				k++;
			} else {
				count++;
			}
		}
		
		// Again, don't forget the last character
		// Error check (last - 1 >= 0) ensures against ArrayIndexOutOfBoundsException where String consists of 1 type of character
		int last = contents.length - 1;
		int lastCount = 1; 
		while ((last - 1 >= 0) && (contents[last] == contents[last-1])) {
			lastCount++;
			last--;
		}
		counts[counts.length-1] = lastCount;
		System.out.printf("Character counts: %s\n", Arrays.toString(counts));
		
		// Now merge
		// 1. Compute the length of the merged array, formula: characters.length + toChars(counts).length
		int mergedLength = characters.length;
		for (int i = 0; i < counts.length; i++) {
			mergedLength += String.valueOf(counts[i]).toCharArray().length;
		}
		
		// 2. Do merge by alternating copying characters and character counts
		compressed = new char[mergedLength];
		int charactersIndex = 0;
		int compressedIndex = 0;
		while (charactersIndex < characters.length) {
			compressed[compressedIndex] = characters[charactersIndex];
			int charsAdded = copyCount(compressed, compressedIndex+1, counts, charactersIndex);
			charactersIndex++;
			compressedIndex = compressedIndex + charsAdded + 1;
		}
		
		System.out.printf("Compressed string: %s\n", new String(compressed));
				
		return new String(compressed);
	}

	private int copyCount(char[] destination, int destinationIndex, int[] source, int sourceIndex) {
		char[] countCharacters = String.valueOf(source[sourceIndex]).toCharArray();
		for (int i = 0; i < countCharacters.length; i++) {
			destination[destinationIndex] = countCharacters[i];
			destinationIndex++;
		}
		return countCharacters.length;
	}

	int compressionOpportunityCount() {
		int count = 1;
		
		for (int i = 0; i < contents.length; i++) {
			if (i+1 != contents.length && contents[i] != contents[i+1]) {
				count++;
			}
		}
		
		return count;
	}
	
	boolean isCompressible(int compressionOpportunityCount) {
		if (contents.length == compressionOpportunityCount) {
			return false;
		}
		return true;
	}
}
