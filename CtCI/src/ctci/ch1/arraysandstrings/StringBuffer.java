package ctci.ch1.arraysandstrings;

/**
 * A simplified implementation of StringBuffer. Can only append String whereas
 * JDK implements appending integers, characters, and more.
 *
 */
public class StringBuffer {

	private char[] chars;
	private int beginIndex;	// where we can begin writing into the chars array
	
	public StringBuffer() {
		chars = new char[10];	// initial size will be 10 chars (arbitrarily)
	}
	
	public void append(String string) {
		// If chars is or will be full, increase size as necessary
		// null Strings are not handled
		incrementCapacityIfFull(string);
		string.getChars(0, string.length(), chars, beginIndex);
		beginIndex += string.length();
	}

	public String toString() {
		return new String(chars);
	}
	
	private void incrementCapacityIfFull(String string) {
		
		// Will the string being appended require more space than is available?
		int availableSpaceAfterAddingNewChars = chars.length - beginIndex - string.length();
		if (availableSpaceAfterAddingNewChars >= 0) {
			return ;	// No need to increment capacity, the String will fit
		}
		
		// If there will be room for -1 chars, increment size by 1, etc.
		int charsToAdd = Math.abs(availableSpaceAfterAddingNewChars);
		char[] newChars = new char[chars.length + charsToAdd];
		
		// Copy current chars into the resized array
		for (int i = 0; i < chars.length; i++) {
			newChars[i] = chars[i];
		}
		
		chars = newChars;
	}
}
