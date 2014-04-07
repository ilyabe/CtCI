package ctci.ch1.arraysandstrings.question1;

/**
 * 1.1. Does a string have all unique characters?
 * 
 */
public class UniqueCharacters {
	
	private String string;
	private static final int NUMBER_OF_ASCII_CHARACTERS = 256;
	
	public UniqueCharacters(String string) {
		this.string = string;
	}
	
	public boolean areAllCharactersUnique() {
		
		boolean[] chars = new boolean[NUMBER_OF_ASCII_CHARACTERS];
		
		// If there are more characters in the string than there are ASCII characters,
		// then there must be repeats
		if (string.length() > NUMBER_OF_ASCII_CHARACTERS) {
			return false;
		}
		
		for (int i = 0; i < string.length(); i++) {
			
			int charDecimalValue = string.charAt(i);
			
			// Key into the array based on the character's decimal value
			// If true, the char has already been found and isn't unique
			if (chars[charDecimalValue]) {
				return false;
			}
			chars[charDecimalValue] = true;
		}
		
		return true;
	}
}
