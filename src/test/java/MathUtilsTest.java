import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MathUtilsTest {

    private static MathUtils mathUtils;

    @BeforeClass
    public static void init() {
        System.out.println("Before all test methods");
        mathUtils = new MathUtils();
    }

    @AfterClass
    public static void cleanup() {
        System.out.println("After all test methods");
        mathUtils = null;
    }

    @Before
    public void setUp() {
        System.out.println("Before each test method");
    }

    @After
    public void tearDown() {
        System.out.println("After each test method");
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
        assertEquals(-1, mathUtils.add(-2, 1));
    }

    @Ignore
    @Test
    public void testSubtract() {
        assertEquals(1, mathUtils.subtract(3, 2));
        assertEquals(-3, mathUtils.subtract(-2, 1));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
        assertEquals(-2, mathUtils.multiply(-2, 1));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3), 0.001);
        assertEquals(-2.0, mathUtils.divide(2, -1), 0.001);
        assertEquals(-1.0, mathUtils.divide(5, 0), 0.001); // Division by zero
    }
}

