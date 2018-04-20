package itam.ejercicio;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSolucion {

    

    
    private Solucion s = new Solucion();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void problemaTest() {
        assertEquals(true,s.gus("abab"));
	assertEquals(true,s.gus("cccccc"));
	assertEquals(true,s.gus("mojomojo"));
	assertEquals(true,s.gus("bububu"));
	assertEquals(true,s.gus("aaaaaaaa"));
	assertEquals(true,s.gus("afafafaf"));
	assertEquals(true,s.gus("aaaabaaaab"));
	assertEquals(true,s.gus("bubububu"));
	assertEquals(true,s.gus("buffabuffa"));
	assertEquals(true,s.gus("bolobolo"));
	assertEquals(false,s.gus("aaaaaaaaaaaf"));
	assertEquals(false,s.gus("aaf"));
	assertEquals(false,s.gus("buffabuffaf"));
	assertEquals(false,s.gus("abba"));
	assertEquals(false,s.gus("queen"));
	assertEquals(false,s.gus("tuc"));
	assertEquals(false,s.gus("tavo"));
	assertEquals(false,s.gus("miguel"));
	assertEquals(false,s.gus("geo"));
        
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
