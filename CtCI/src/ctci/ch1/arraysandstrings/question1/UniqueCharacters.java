package ctci.ch1.arraysandstrings.question1;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.1. Does a string have all unique characters?
 * 
 */
public class UniqueCharacters {
	
	private Set<Character> characters = new HashSet<Character>();
	private String string;
	
	public UniqueCharacters(String string) {
		this.string = string;
	}
	
	public boolean areAllCharactersUnique() {
		
		for (int i = 0; i < string.length(); i++) {		
			boolean isAdded = characters.add(Character.toLowerCase(string.charAt(i)));
			
			// If a character couldn't be added, then it's not unique
			if (!isAdded) {
				return false;
			}
		}
		
		// All characters were added to the Set and so they're all unique
		return true;
	}
}
