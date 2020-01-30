package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Translator;

/**
 * @author Angela Ward
 * 
 *         This test collection tests the Translator.setHasData logic.
 *
 */
public class BooleanTest {

	Translator test1 = new Translator();
	Translator test2 = new Translator("Stuff");

	/**
	 * Tests for correctly flagging variable to false.
	 */
	@Test
	public void testFalse() {
		test1.setHasData();
		assertFalse(test1.isHasData());
	}

	/**
	 * Tests for correctly flagging variable to true.
	 */
	@Test
	public void testTrue() {
		test2.setHasData();
		assertTrue(test2.isHasData());
	}
}
