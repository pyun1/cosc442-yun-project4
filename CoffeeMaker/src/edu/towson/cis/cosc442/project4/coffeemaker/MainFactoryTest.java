package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MainFactoryTest</code> contains tests for the class <code>{@link MainFactory}</code>.
 *
 * @generatedBy CodePro at 3/21/18 9:07 PM
 * @author Paul Yun
 * @version $Revision: 1.0 $
 */
public class MainFactoryTest {
	/**
	 * Run the Main createMain() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	@Test
	public void testCreateMain_1()
		throws Exception {

		Main result = MainFactory.createMain();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Main createMain2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	@Test
	public void testCreateMain2_1()
		throws Exception {

		Main result = MainFactory.createMain2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Main createMain3() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	@Test
	public void testCreateMain3_1()
		throws Exception {

		Main result = MainFactory.createMain3();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MainFactoryTest.class);
	}
}