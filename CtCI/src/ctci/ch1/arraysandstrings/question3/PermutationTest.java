package ctci.ch1.arraysandstrings.question3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationTest {

	@Test
	public void test() {
		assertTrue(new Permutation("abcdefg", "gfedcba").isPermutation());
		assertFalse(new Permutation("abcdefg", "qwerty").isPermutation());
		assertFalse(new Permutation("aaB", "aa").isPermutation());
		assertFalse(new Permutation("111234", "111235").isPermutation());
		assertTrue(new Permutation("%#(%*!)@", "@()%%*!#").isPermutation());
		assertFalse(new Permutation("jja", "jaa").isPermutation());	// Tests that character counts are the same as opposed to just matching
	}

}
