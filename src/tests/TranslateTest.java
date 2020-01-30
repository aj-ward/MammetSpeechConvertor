package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Translator;

/**
 * @author Angela Ward
 * 
 *         This test collection validates the translation logic in
 *         Translator.translate.
 *
 */
public class TranslateTest {

	Translator trans = new Translator();

	/**
	 * Tests an empty string.
	 */
	@Test
	public void testEmpty() {
		assertEquals("", trans.translate(""));
	}

	/**
	 * Tests a valid quote.
	 */
	@Test
	public void testSentence() {
		assertEquals("NoT eVeN fIt FoR mAkInG a ChAmBeR pOt.",
				trans.translate("Not even fit for making a chamber pot."));
	}

	/**
	 * Tests a string of numbers.
	 */
	public void testNum() {
		assertEquals("12345", trans.translate("12345"));
	}

}
