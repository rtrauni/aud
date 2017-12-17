package at.hallermayr.aud.ex01palindrome;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Ex01Palindrome.
 */
public class Ex01PalindromeTest extends TestCase {
	Ex01Palindrome ex01Palindrome = new Ex01Palindrome();

	public Ex01PalindromeTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(Ex01PalindromeTest.class);
	}

	public void testOttoForPalindrom() {
		assertTrue(ex01Palindrome.checkPalindrome("otto".toCharArray()));
	}

	public void testMaxForPalindrome() {
		assertFalse(ex01Palindrome.checkPalindrome("max".toCharArray()));
	}
	
	public void testMadamForPalindrome() {
		assertTrue(ex01Palindrome.checkPalindrome("madam".toCharArray()));
	}
	
	public void testAnnaForPalindrome() {
		assertTrue(ex01Palindrome.checkPalindrome("anna".toCharArray()));
	}
	
	public void testRudiForPalindrome() {
		assertFalse(ex01Palindrome.checkPalindrome("rudi".toCharArray()));
	}
	
	public void testFederschachtelForPalindrome() {
		assertFalse(ex01Palindrome.checkPalindrome("federschachtel".toCharArray()));
	}

	// todo two more tests with palindromes, two more tests without palindromes
}
