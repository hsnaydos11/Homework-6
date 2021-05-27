package fordfulkersonTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import Algorithm.FordFulkerson;

public class FordFulkersonTest {

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
		int graph[][] = new int[][] {
            { 0, 16, 13, 0, 0, 0 }, { 0, 0, 10, 12, 0, 0 },
            { 0, 4, 0, 0, 14, 0 },  { 0, 0, 9, 0, 0, 20 },
            { 0, 0, 0, 7, 0, 4 },   { 0, 0, 0, 0, 0, 0 }
        };
        FordFulkerson m = new FordFulkerson();
        
        int result = m.fordFulkerson(graph, 0, 5);
        assertEquals(result, 23);      
	}
	@Test
	public void testBad() {
		int graph[][] = new int[][] {
            { 0, 15, 10, 0, 0, 0 }, { 0, 0, 9, 13, 0, 0 },
            { 0, 4, 0, 0, 14, 0 },  { 0, 0, 12, 0, 0, 10 },
            { 0, 0, 4, 9, 0, 4 },   { 0, 1, 0, 0, 0, 0 }
        };
        FordFulkerson m = new FordFulkerson();
        
        int result = m.fordFulkerson(graph, 0, 5);
        assertSame(result, 24);
	}
	@Test
	public void Ugly() {
		int graph[][] = new int[][] {
            { 0, 16, 13, 0, 0, 0 }, { 0, 0, 10, 12, 0, 0 },
            { 0, 4, 0, 0, 14, 0 },  { 0, 0, 9, 0, 0, 20 },
            { 0, 0, 0, 7, 0, 4 },   { 0, 0, 0, 0, 0, 0 }
        };
        FordFulkerson m = new FordFulkerson();
        
        int result = m.fordFulkerson(graph, 0, 5);
        assertNotEquals(result, 22);
	}
}
