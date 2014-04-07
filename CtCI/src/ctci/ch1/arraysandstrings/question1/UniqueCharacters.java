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
		
		char[] chars = new char[NUMBER_OF_ASCII_CHARACTERS];
		
		// If there are more characters in the string than there are ASCII characters,
		// then there must be repeats
		if (string.length() > NUMBER_OF_ASCII_CHARACTERS) {
			return false;
		}
		
		// Put each ASCII character in array, using its decimal value as the index
		for (int i = 0; i < string.length(); i++) {
			
			// Key into the array based on the character's decimal value
			// If a character is already there, then it must not be unique
			if (chars[string.charAt(i)] == string.charAt(i)) {
				return false;
			}
			chars[string.charAt(i)] = string.charAt(i);
		}
		
		return true;
	}
}
