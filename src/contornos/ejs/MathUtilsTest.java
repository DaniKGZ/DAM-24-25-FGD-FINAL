package contornos.ejs;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @Test
    void testFactorial() {
        int result = MathUtils.factorial(2);
        assertEquals(result, 2);
        result = MathUtils.factorial(8);
        assertEquals(result, 40320);
    }

    @Test
    void testFactorial2() {
        int result = MathUtils.factorial(8);
        assertEquals(result, 40320);
    }

    @Test
    void testExcepcion() {
        try {
            MathUtils.factorial(-1);
                } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
