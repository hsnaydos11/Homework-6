package QLearningTest;

import static org.junit.Assert.*;
import org.junit.Test;

import Algorithm.QLearning;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class QLearningTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testGood() {
		QLearning obj = new QLearning();
		 
        obj.run();
        obj.printResult();
        obj.showPolicy();
        
	}
	
	@Test
	public void testBad() {
		QLearning obj = new QLearning();
		 
        obj.run();
        obj.printResult();
        obj.showPolicy();
	}
	@Test
	public void testUgly() {
		QLearning obj = new QLearning();
		 
        obj.run();
        obj.printResult();
        obj.showPolicy();
      
	}
}
