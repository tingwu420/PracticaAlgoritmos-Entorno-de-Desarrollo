package tests;
 
import static org.junit.Assert.*;
 import org.junit.Test;
 import static org.junit.Assert.assertEquals;
 import util.Algoritmos;

 public class Test {
	 @Test
	    public void testFibonacci() {
	        assertEquals(0, Algoritmos.fibonacci(0));
	        assertEquals(1, Algoritmos.fibonacci(1));

	    }
	
	@Test
	    public void testFactorial() {
	        assertEquals(1, Algoritmos.factorial(0));
	        assertEquals(1, Algoritmos.factorial(1));
	 }
	 
	 
	 @Test
	    public void testEsPrimo() {
	        assertFalse(Algoritmos.esPrimo(0));
	        assertFalse(Algoritmos.esPrimo(1));
	 }
	
}
