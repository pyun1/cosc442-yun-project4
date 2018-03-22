package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RecipeFactoryTest</code> contains tests for the class <code>{@link RecipeFactory}</code>.
 *
 * @generatedBy CodePro at 3/21/18 9:07 PM
 * @author Paul Yun
 * @version $Revision: 1.0 $
 */
public class RecipeFactoryTest {
	/**
	 * Run the Recipe createRecipe() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	@Test
	public void testCreateRecipe_1()
		throws Exception {

		Recipe result = RecipeFactory.createRecipe();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtChocolate());
	}

	/**
	 * Run the Recipe createRecipe2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	@Test
	public void testCreateRecipe2_1()
		throws Exception {

		Recipe result = RecipeFactory.createRecipe2();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtChocolate());
	}

	/**
	 * Run the Recipe createRecipe3() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	@Test
	public void testCreateRecipe3_1()
		throws Exception {

		Recipe result = RecipeFactory.createRecipe3();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtChocolate());
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
		new org.junit.runner.JUnitCore().run(RecipeFactoryTest.class);
	}
}