package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryFactoryTest</code> contains tests for the class <code>{@link InventoryFactory}</code>.
 *
 * @generatedBy CodePro at 3/21/18 9:07 PM
 * @author Paul Yun
 * @version $Revision: 1.0 $
 */
public class InventoryFactoryTest {
	/**
	 * Run the Inventory createInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	@Test
	public void testCreateInventory_1()
		throws Exception {

		Inventory result = InventoryFactory.createInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getChocolate());
	}

	/**
	 * Run the Inventory createInventory2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	@Test
	public void testCreateInventory2_1()
		throws Exception {

		Inventory result = InventoryFactory.createInventory2();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getChocolate());
	}

	/**
	 * Run the Inventory createInventory3() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/21/18 9:07 PM
	 */
	@Test
	public void testCreateInventory3_1()
		throws Exception {

		Inventory result = InventoryFactory.createInventory3();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getChocolate());
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
		new org.junit.runner.JUnitCore().run(InventoryFactoryTest.class);
	}
}