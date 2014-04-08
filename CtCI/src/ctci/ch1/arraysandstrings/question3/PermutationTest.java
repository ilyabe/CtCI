package ctci.ch1.arraysandstrings.question3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationTest {

	@Test
	public void isPermutationTest() {
		assertTrue(new Permutation("abcdefg", "gfedcba").isPermutation());
		assertFalse(new Permutation("abcdefg", "qwerty").isPermutation());
		assertFalse(new Permutation("aaB", "aa").isPermutation());
		assertFalse(new Permutation("111234", "111235").isPermutation());
		assertTrue(new Permutation("%#(%*!)@", "@()%%*!#").isPermutation());
		assertFalse(new Permutation("jja", "jaa").isPermutation());	// Tests that character counts are the same as opposed to just matching
	}

	@Test
	public void isPermutationViaStringSortingTest() {
		assertTrue(new Permutation("abcdefg", "gfedcba").isPermutationViaStringSorting());
		assertFalse(new Permutation("abcdefg", "qwerty").isPermutationViaStringSorting());
		assertFalse(new Permutation("aaB", "aa").isPermutationViaStringSorting());
		assertFalse(new Permutation("111234", "111235").isPermutationViaStringSorting());
		assertTrue(new Permutation("%#(%*!)@", "@()%%*!#").isPermutationViaStringSorting());
		assertFalse(new Permutation("jja", "jaa").isPermutationViaStringSorting());	// Tests that character counts are the same as opposed to just matching
	}
}
