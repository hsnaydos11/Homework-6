package DinicsTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import java.util.List;
import org.junit.Test;

import Algorithm.Dinics;
import Algorithm.Dinics.Edge;

public class DinicsTest {

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
	    List<Edge>[] graph = Dinics.createGraph(3);
	    Dinics.addEdge(graph, 0, 1, 3);
	    Dinics.addEdge(graph, 0, 2, 2);
	    Dinics.addEdge(graph, 1, 2, 2);
	    int result = Dinics.maxFlow(graph, 0, 2);
	    assertNotEquals(result, 22);
	}
	@Test
	public void testBad() {
	    List<Edge>[] graph = Dinics.createGraph(3);
	    Dinics.addEdge(graph, 2, 3, 4);
	    Dinics.addEdge(graph, 0, 2, 2);
	    Dinics.addEdge(graph, 1, 2, 2);
	    int result = Dinics.maxFlow(graph, 0, 2);
	    assertNotEquals(result, 22);
	}
	@Test
	public void testUgly() {
	    List<Edge>[] graph = Dinics.createGraph(3);
	    Dinics.addEdge(graph, 0, 1, 3);
	    Dinics.addEdge(graph, 0, 2, 2);
	    Dinics.addEdge(graph, 1, 2, 2);
	    int result = Dinics.maxFlow(graph, 0, 2);
	    assertNotEquals(result, 22);
	}

}
