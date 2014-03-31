package ctci.ch1.arraysandstrings;
import java.util.ArrayList;
import java.util.List;

/**
 * Simplified implementation of StringBuffer. Can only append String whereas
 * JDK implements appending integers, characters, and more.
 *
 */
public class StringBuffer {

	public List<String> strings = new ArrayList<String>();
	
	public void append(String string) {
		strings.add(string);
	}
	
	public String toString() {
		String string = "";
		
		for (String s : strings) {
			string += s;
		}
		
		return string;
	}
}
