
import junit.framework.TestCase;

/**
 * The class <code>NormalHangManTest</code> contains tests for the class {@link
 * <code>NormalHangMan</code>}
 *
 * @pattern JUnit Test Case
 *
 * @generatedBy CodePro at 10/6/15 3:12 PM
 *
 * @author linjie
 *
 * @version $Revision$
 */
public class NormalHangManTest extends TestCase {
	
	NormalHangMan normal;

	/**
	 * Construct new test instance
	 *
	 * @param name the test name
	 */
	public NormalHangManTest(String name) {
		super(name);
	}

	/**
	 * Perform pre-test initialization
	 *
	 * @throws Exception
	 *
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		normal = new NormalHangMan("SOFTWARE", 10, "");
	}
	
	/**
	 * Run the boolean makeGuess(char) method first guess
	 */
	public void testMakeGuessFirstTry() {
		// add test code here
		assertEquals(normal.originSecretWord, "SOFTWARE");
		assertEquals(10, normal.numGuessesRemaining());
		assertEquals(8, normal.numLettersRemaining());
		assertEquals("", normal.history);
		assertTrue(normal.makeGuess('S'));
		assertEquals(normal.originSecretWord, "SOFTWARE");
		assertEquals(10, normal.numGuessesRemaining());
		assertEquals(7, normal.numLettersRemaining());
		assertEquals("S", normal.history);
		assertEquals('S', normal.guess);
		assertFalse(normal.gameOver());
		assertTrue(normal.isWin());
	}
	
	/**
	 * Run the boolean makeGuess(char) method the user wins
	 */
	public void testMakeGuessWin() {
		// add test code here
		normal.guessesRemaining = 3;
		normal.numLettersLeft = 1;
		normal.history = "SOFTWAR";
		assertTrue(normal.makeGuess('E'));
		assertEquals(normal.originSecretWord, "SOFTWARE");
		assertEquals(3, normal.numGuessesRemaining());
		assertEquals(0, normal.numLettersRemaining());
		assertEquals("SOFTWARE", normal.history);
		assertEquals('E', normal.guess);
		assertTrue(normal.gameOver());
		assertTrue(normal.isWin());
	}
	
	/**
	 * Run the boolean makeGuess(char) method the user loses
	 */
	public void testMakeGuessFail() {
		// add test code here
		normal.guessesRemaining = 1;
		normal.numLettersLeft = 4;
		normal.history = "SOFTXYZPQ";
		assertFalse(normal.makeGuess('B'));
		assertEquals(normal.originSecretWord, "SOFTWARE");
		assertEquals(0, normal.numGuessesRemaining());
		assertEquals(4, normal.numLettersRemaining());
		assertEquals("SOFTXYZPQB", normal.history);
		assertEquals('B', normal.guess);
		assertTrue(normal.gameOver());
		assertFalse(normal.isWin());
	}
	
	
	/**
	 * Run the boolean makeGuess(char) method test if the guess is not a letter
	 */
	public void testMakeGuessNotLetter() {
		// add test code here
		assertFalse(normal.makeGuess('1'));
	}
	
	
	/**
	 * Run the boolean makeGuess(char) method test if the guess is duplicate
	 */
	public void testMakeGuessDuplicate() {
		// add test code here
		normal.guessesRemaining = 9;
		normal.numLettersLeft = 9;
		normal.history = "S";
		assertFalse(normal.makeGuess('S'));
	}
	
}

/*$CPS$ This comment was generated by CodePro. Do not edit it.
 * patternId = com.instantiations.assist.eclipse.pattern.testCasePattern
 * strategyId = com.instantiations.assist.eclipse.pattern.testCasePattern.junitTestCase
 * additionalTestNames = 
 * assertTrue = false
 * callTestMethod = true
 * createMain = true
 * createSetUp = true
 * createTearDown = false
 * createTestFixture = false
 * createTestStubs = false
 * methods = 
 * package = 
 * package.sourceFolder = EvilHangman/src
 * superclassType = junit.framework.TestCase
 * testCase = NormalHangManTest
 * testClassType = NormalHangMan
 */