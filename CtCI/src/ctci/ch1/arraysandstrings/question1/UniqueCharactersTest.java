package ctci.ch1.arraysandstrings.question1;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharactersTest {

	@Test
	public void test() {
		assertFalse(new UniqueCharacters("hello").areAllCharactersUnique());
		assertTrue(new UniqueCharacters("world").areAllCharactersUnique());
		
		// L and l are different ASCII characters
		assertTrue(new UniqueCharacters("heLlo").areAllCharactersUnique());
		
		assertTrue(new UniqueCharacters("0123456789").areAllCharactersUnique());
	}

}
