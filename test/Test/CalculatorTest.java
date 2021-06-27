
package Test;




import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test; 
import org.junit.Assert; 
import org.junit.Before;
import org.junit.BeforeClass;

public class CalculatorTest {
private Calculator objCalcUnderTest;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

@Before
public void setUp() {

objCalcUnderTest = new Calculator();
}

    @After
    public void tearDown() throws Exception {
    }

@Test
public void testAdd() { 
int a = 15; int b = 20; 
int beklenenSonuç = 35;

long result = objCalcUnderTest.add(a, b);

Assert.assertEquals(beklenenSonuç, result);
}

@Test
public void testSubtract() {
int a = 25; int b = 20; 
int beklenenSonuç = 5; 
long result = objCalcUnderTest.subtract(a, b);
Assert.assertEquals(beklenenSonuç, result);
}

@Test
public void testMultiply() {
int a = 5; int b = 25;
long beklenenSonuç = 125;
long result = objCalcUnderTest.multiply(a, b);
Assert.assertEquals(beklenenSonuç, result);
}

@Test
public void testDivide() {
int a = 58; int b = 10; 
double beklenenSonuç = 5.8; 
double result = objCalcUnderTest.divide(a, b);
Assert.assertEquals(beklenenSonuç, result,0.00005); 
}

@Test(expected = IllegalArgumentException.class)
public void testDivideByZero() { 
int a = 15; int b = 0;
objCalcUnderTest.divide(a, b);
} 
}