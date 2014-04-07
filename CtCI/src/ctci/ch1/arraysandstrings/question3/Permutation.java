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
		if (string.length() != other.length()) {
			return false;
		}
		
		boolean[] stringValues = new boolean[NUMBER_OF_ASCII_CHARACTERS];
		for (int i = 0; i < string.length(); i++) {
			int stringValue = string.charAt(i);
			stringValues[stringValue] = true;
		}
		
		for (int i = 0; i < other.length(); i++) {
			int otherValue = other.charAt(i);
			if (!stringValues[otherValue]) {
				return false;
			}
		}
		
		return true;
	}
}
