/*
 * Daniel Fernandez Garcia - 77551592P
 * DAM 1
 */

package contornos.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class DiscountSystemTest {
    @Test
    void testException() {
        try {
            DiscountSystem.applyDiscount(-1, true);   
            fail("No devuelve la excepción cuando el parámetro es negativo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testException0() {
        try {
            DiscountSystem.applyDiscount(0, true);   
            fail("No devuelve la excepción cuando el parámetro es negativo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testDisc2(){
        assertEquals(49, DiscountSystem.applyDiscount(49, false), 0.01);   
    }

    @Test
    void testDisc3(){
        assertEquals(50-(50*0.05), DiscountSystem.applyDiscount(50, false), 0.01);   
    }

    @Test
    void testDisc4(){
        assertEquals(51-(51*0.05), DiscountSystem.applyDiscount(51, false), 0.01);   
    }

    @Test
    void testDisc5(){
        assertEquals(99-(99*0.05), DiscountSystem.applyDiscount(99, false), 0.01);   
    }

    @Test
    void testDisc6(){
        assertEquals(100-(100*0.1), DiscountSystem.applyDiscount(100, false), 0.01);   
    }

    @Test
    void testDisc7(){
        assertEquals(199-(199*0.1), DiscountSystem.applyDiscount(199, false), 0.01);   
    }
     
    @Test
    void testDisc8(){
        assertEquals(200-(200*0.15), DiscountSystem.applyDiscount(200, true), 0.01);   
    }

    @Test
    void testDisc9(){
        assertEquals(201-(201*0.15), DiscountSystem.applyDiscount(201, true), 0.01);   
    }

    @Test
    void testDisc10(){
        assertEquals(101-(101*0.1), DiscountSystem.applyDiscount(101, false), 0.01);   
    }

    @Test
    void testDisc11(){
        assertEquals(200-(200*0.1), DiscountSystem.applyDiscount(200, false), 0.01);   
    }

    @Test
    void testDisc12(){
        assertEquals(201-(201*0.1), DiscountSystem.applyDiscount(201, false), 0.01);   
    }
}