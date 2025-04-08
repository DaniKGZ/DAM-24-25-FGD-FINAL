/*
 * Daniel Fernandez Garcia - 77551592P
 * DAM 1
 */
package contornos.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    @Test
    void EmailTest1() {
        assertEquals(false, EmailValidator.isValid(null));
    }

    @Test
    void EmailTest2() {
        assertEquals(false, EmailValidator.isValid("abc123"));
    }

    @Test
    void EmailTest3() {
        assertEquals(false, EmailValidator.isValid("abc123@123@123"));
    }   

    @Test
    void EmailTest4() {
        assertEquals(false, EmailValidator.isValid("abc123@123123"));
    }    

    @Test
    void EmailTest5() {
        assertEquals(true, EmailValidator.isValid("abc123@123.123"));
    }     

    @Test
    void EmailTest6() {
        assertEquals(false, EmailValidator.isValid("@123.23"));
    }    
    @Test
    void EmailTest7() {
        assertEquals(false, EmailValidator.isValid("abc123@@123.123"));
    }    
}
