package ctci.ch1.arraysandstrings.question5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompressionTest {

	@Test
	public void testCompress() {
		assertEquals("a2b1c5a11", new Compression("aabcccccaaaaaaaaaaa").compress());
		assertEquals("a2b1c5", new Compression("aabccccc").compress());
		assertEquals("a2", new Compression("aa").compress());
		assertEquals("a2b1", new Compression("aab").compress());
		assertEquals("asdf", new Compression("asdf").compress());
		assertEquals("a", new Compression("a").compress());
		assertEquals(">20311", new Compression(">>0001").compress());
	}

	@Test
	public void testCompressedArraySize() {
		assertEquals(2, new Compression("ab").compressionOpportunityCount());
		assertEquals(3, new Compression("abbc").compressionOpportunityCount());
		assertEquals(3, new Compression("abbcc").compressionOpportunityCount());
		assertEquals(4, new Compression("abbccaa").compressionOpportunityCount());
	}
	
	@Test
	public void testIsCompressible() {
		assertFalse(new Compression("ab").isCompressible(2));
		assertTrue(new Compression("abbc").isCompressible(3));
		assertTrue(new Compression("abbcc").isCompressible(3));
	}
	
}
