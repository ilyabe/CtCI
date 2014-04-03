package ctci.ch1.arraysandstrings.question1;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharactersTest {

	@Test
	public void test() {
		assertFalse(new UniqueCharacters("hello").areAllCharactersUnique());
		assertTrue(new UniqueCharacters("world").areAllCharactersUnique());
		
		// Missed this case initially, case-sensitive? 
		// Let's assume case shouldn't matter, e.g. l and L aren't unique
		assertFalse(new UniqueCharacters("heLlo").areAllCharactersUnique());
	}

}
