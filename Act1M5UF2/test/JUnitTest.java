/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import myutils.MyUtils;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author ALUMNEDAM
 */
public class Act1UF2M5 {
    
    public Act1UF2M5() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
        
/**
     *
     * @throws Errores
     */
        @Test
    public final void testCadenaInvertida () throws Errores {

        assertEquals("aloH", MyUtils.cadenaInvertida("Hola"));
    
    }
        @Test
        public final void testInvertirCadenanull () throws Errores {

        assertEquals("null", MyUtils.cadenaInvertida(null));
    
    }
        @Test
    public final void testInvertirCadena_matias () throws Errores {

        assertEquals("saitaM", MyUtils.cadenaInvertida("Matias"));
    
    }
        @Test
        public final void testEdat () throws Errores {

        assertEquals(20, MyUtils.edad(29, 9, 1996));
    
    }
        @Test
    public final void testEdatNegativo () throws Errores {

        assertEquals(-2, MyUtils.edad(29, 9, -1996));
    
    }
        @Test
    public final void testEdatImposible () throws Errores {

        assertEquals(-1, MyUtils.edad(29, 9, 996));
    
    }
        @Test
    public final void testFactorial1 () throws Errores {

        assertEquals(1, MyUtils.factorial(1));
    
    }
        @Test
        public final void testFactorialNegativo () throws Errores {

        assertEquals(-1, MyUtils.factorial(-3));
    
    }
        @Test
        public final void testFactorial5 () throws Errores {

        assertEquals(120, MyUtils.factorial(5));
    
    }
    
    
}
