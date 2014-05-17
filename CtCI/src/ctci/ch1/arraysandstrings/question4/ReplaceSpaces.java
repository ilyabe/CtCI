package ctci.ch1.arraysandstrings.question4;

public class ReplaceSpaces {

	public String replaceSpaces(String string, int trueLength) {
		
		// Simple error check, an empty string has no spaces, so it's safe to return it immediately
		if (trueLength == 0) {
			return string;
		}
		
		// To do the operation in place, convert the given string to a character array
		char[] contents = string.toCharArray();
		
		// Index of the last character in the string, excluding padding
		int wordEnd = contents.length - (contents.length - trueLength) - 1;
		
		// Index of the last padding character
		int paddingEnd = contents.length - 1;
		
		// From the end of the string, excluding padding, to the beginning
		for (int i = wordEnd; i >= 0; i--) {
			if (isSpace(contents[i])) {
				// Shift the characters to the right to make room for %20
				int spaceEnd = shiftRight(contents, i + 1, paddingEnd, wordEnd);
				
				// The length of the substring that was shifted
				int wordLength = wordEnd - i;
				
				// The padding is decreased by the size of the string that was shifted + 3 for the %20 characters
				paddingEnd = paddingEnd - wordLength - 3; // - an additional 3 for the %20
				
				// Mark the spot of the end of the next word
				wordEnd = i - 1;
				
				// Fill the newly created space with %20
				contents[spaceEnd] = '0';
				contents[spaceEnd - 1] = '2';
				contents[spaceEnd - 2] = '%';
			}
		}
		return new String(contents);
		
	}
	
	private boolean isSpace(char c) {
		if (c == ' ') {
			return true;
		}
		return false;
	}
	
	/**
	 * Shifts characters to the right of a space character to the right in the contents array to make room for the %20 characters
	 * 
	 * @param contents The character array
	 * @param wordStart The index immediately ahead of a space character
	 * @param paddingEnd The index of the last padding character
	 * @param wordEnd The last character in the substring of the actual string. The substring being the part of the string
	 * 					that has not yet been shifted to the right to accommodate the %20 characters
	 * @return The last index of the padding after shifting the characters to the right of the space
	 */
	private int shiftRight(char[] contents, int wordStart, int paddingEnd, int wordEnd) {
		for (int i = wordEnd; i >= wordStart; i--) {
			contents[paddingEnd] = contents[i];
			paddingEnd--;
		}
		return paddingEnd;
	}
}
