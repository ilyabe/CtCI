package ctci.ch1.arraysandstrings.question8;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotationTest {

	@Test
	public void test() {
		assertTrue(new Rotation().isRotation("waterbottle", "tlewaterbot"));
		assertFalse(new Rotation().isRotation("hello", "world"));
		assertFalse(new Rotation().isRotation("different", "lengths"));
		assertTrue(new Rotation().isRotation("erie", "eeri"));
		assertFalse(new Rotation().isRotation("scrambled", "sdcerlabm"));
	}

}
