package EdmondsKarpTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Algorithm.EdmondsKarp;
import Algorithm.EdmondsKarp.Edge;

public class EdmondsKarpTest {
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
		List<Edge>[] graph = EdmondsKarp.createGraph(3);
		EdmondsKarp.addEdge(graph, 0, 1, 3);
		EdmondsKarp.addEdge(graph, 0, 2, 2);
		EdmondsKarp.addEdge(graph, 1, 2, 2);

	    int result = EdmondsKarp.maxFlow(graph, 0 ,2);
	    assertEquals(result, 4);
	}
	@Test
	public void testBad() {
		List<Edge>[] graph = EdmondsKarp.createGraph(3);
	    EdmondsKarp.addEdge(graph, 2, 3, 4);
	    EdmondsKarp.addEdge(graph, 0, 2, 2);
	    EdmondsKarp.addEdge(graph, 1, 2, 2);
	    int result = EdmondsKarp.maxFlow(graph, 0 ,2);
	    assertEquals(result, 4);
	}
	@Test
	public void testUgly() {
		List<Edge>[] graph = EdmondsKarp.createGraph(3);
	    EdmondsKarp.addEdge(graph, 0, 1, 3);
	    EdmondsKarp.addEdge(graph, 0, 2, 2);
	    EdmondsKarp.addEdge(graph, 1, 2, 2);
	    
	    int result = EdmondsKarp.maxFlow(graph, 0 ,2);
	    assertNotEquals(result, 4);
	}

}
