package ctci.ch1.arraysandstrings.question4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReplaceSpacesTest {
	
	@Test
	public void test() {
		assertEquals("Hello%20World", new ReplaceSpaces().replaceSpaces("Hello World  ", 11));
		assertEquals("Mr%20John%20Smith", new ReplaceSpaces().replaceSpaces("Mr John Smith    ", 13));
		assertEquals("M", new ReplaceSpaces().replaceSpaces("M", 1));
		assertEquals("Mr", new ReplaceSpaces().replaceSpaces("Mr", 2));
		assertEquals("Mr%20", new ReplaceSpaces().replaceSpaces("Mr   ", 3));
		assertEquals("%20Mr", new ReplaceSpaces().replaceSpaces(" Mr  ", 3));
		assertEquals("Hello%20%20World", new ReplaceSpaces().replaceSpaces("Hello  World    ", 12));
		assertEquals("%20", new ReplaceSpaces().replaceSpaces("   ", 1));
		assertEquals("%20R%20%20andom%20Sp%20%20%20a%20c%20e%20s%20", 
				new ReplaceSpaces().replaceSpaces(" R  andom Sp   a c e s                       ", 23));
	}

}
