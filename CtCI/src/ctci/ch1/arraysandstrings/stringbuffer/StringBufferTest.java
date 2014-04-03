package ctci.ch1.arraysandstrings.stringbuffer;
import static org.junit.Assert.*;

import org.junit.Test;


public class StringBufferTest {

	@Test
	public void test() {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello ");
		sb.append("World");
		sb.append("!");
		sb.append(" I ");
		sb.append("am a ");
		sb.append("simple ");
		sb.append("StringBuffer!");
		assertEquals("Hello World! I am a simple StringBuffer!", sb.toString());
	}

}
