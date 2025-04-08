package contornos.ejs;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test
    void testIsValid() {
        boolean result;
        String pass="abcABC123";
        result=PasswordValidator.isValid(pass);
        assertEquals(true, result);
    }

    @Test
    void testIsValidNoDigit() {
        boolean result;
        String pass="abcdACBD";
        result=PasswordValidator.isValid(pass);
        assertEquals(false, result);

    }

    @Test
    void testIsValidNoCap() {
        String pass="abcd1234";
        boolean result;
        result=PasswordValidator.isValid(pass);
        assertEquals(false, result);
    }

    @Test
    void testIsValidLessThan8() {
        String pass="Ab12";
        boolean result;
        result=PasswordValidator.isValid(pass);
        assertEquals(false, result);
    }
}
