package ctci.ch1.arraysandstrings;
import static org.junit.Assert.*;

import org.junit.Test;


public class StringBufferTest {

	@Test
	public void test() {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello ");
		sb.append("World");
		sb.append("!");
		assertEquals("Hello World!", sb.toString());
	}

}
