package ctci.ch1.arraysandstrings;

/**
 * A simplified implementation of StringBuffer. Can only append String whereas
 * JDK implements appending integers, characters, and more.
 *
 */
public class StringBuffer {

	private char[] chars;
	private int charsBegin;	// where we can begin writing
	
	public StringBuffer() {
		chars = new char[10];	// initial size will be 10 chars
	}
	
	public void append(String string) {
		// If chars is or will be full, increase size as necessary
		// null Strings are not handled
		incrementCapacityIfFull(string);
		string.getChars(0, string.length(), chars, charsBegin);
		charsBegin += string.length();
	}

	public String toString() {
		return new String(chars);
	}
	
	private void incrementCapacityIfFull(String string) {
		// How many chars do I need to add?
		int charsRoomFor = chars.length - charsBegin - string.length();
		if (charsRoomFor >= 0) {
			return ;	// No need to increment capacity, the String will fit
		}
		
		int charsToAdd = Math.abs(charsRoomFor);
		char[] newChars = new char[chars.length + charsToAdd];
		
		// Copy current chars
		for (int i = 0; i < chars.length; i++) {
			newChars[i] = chars[i];
		}
		
		// Add the new chars
		for (int i = chars.length; i < string.length(); i++) {
			newChars[i] = string.charAt(i);
		}
		
		chars = newChars;
	}
}
