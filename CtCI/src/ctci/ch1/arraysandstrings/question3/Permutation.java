package ctci.ch1.arraysandstrings.question3;

public class Permutation {

	private String string;
	private String other;
	
	private static final int NUMBER_OF_ASCII_CHARACTERS = 256;
	
	public Permutation(String string, String other) {
		this.string = string;
		this.other = other;
	}
	
	public boolean isPermutation() {
		// If lengths are different, other is not a permutation
		if (string.length() != other.length()) {
			return false;
		}
		
		int[] stringCounts = new int[NUMBER_OF_ASCII_CHARACTERS];
		int[] otherCounts = new int[NUMBER_OF_ASCII_CHARACTERS];
		
		// Store the count of each character for both strings keying on each char's decimal value
		for (int i = 0; i < string.length(); i++) {
			stringCounts[string.charAt(i)]++;
		}
		
		for (int i = 0; i < other.length(); i++) {
			otherCounts[other.charAt(i)]++;
		}
		
		// If any counts are unequal, other is not a permutation
		for (int i = 0; i < NUMBER_OF_ASCII_CHARACTERS; i++) {
			if (stringCounts[i] != otherCounts[i]) {
				return false;
			}
		}
		
		return true;
	}
}
