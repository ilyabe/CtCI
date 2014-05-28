package ctci.ch1.arraysandstrings.question8;

/*
 * Given the isSubstring method, how can one determine whether one string is a rotation of another
 * while calling isSubstring only once. For example, a rotation of "waterbottle" is "tlewaterbot"
 */
public class Rotation {

	public boolean isRotation(String string, String other) {
		// Different lengths means other cannot be a rotation
		if (string.length() != other.length()) {
			return false;
		}
		
		// Duplicating the string enumerates all possible rotations
		String twin = string + string;
		
		// If other is within that enumeration, then it's a rotation
		if (isSubstring(twin, other)) {
			return true;
		}
		
		return false;
	}
	
	private boolean isSubstring(String string, String other) {
		return string.toLowerCase().contains(other);
	}
}
