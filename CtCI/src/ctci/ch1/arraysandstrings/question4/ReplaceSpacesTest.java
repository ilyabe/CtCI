package ctci.ch1.arraysandstrings.question4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReplaceSpacesTest {
	
	@Test
	public void test() {
		assertEquals("Hello%20World", new ReplaceSpaces().replaceSpaces("Hello World  ", 11));
		assertEquals("Mr%20John%20Smith", new ReplaceSpaces().replaceSpaces("Mr John Smith      ", 13));
		assertEquals("M", new ReplaceSpaces().replaceSpaces("M", 1));
		assertEquals("Mr", new ReplaceSpaces().replaceSpaces("Mr", 2));
		assertEquals("Mr   ", new ReplaceSpaces().replaceSpaces("Mr%20", 3));
	}

}
