/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizbuz;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author munif
 */
public class FizBuzTest {

    private final FizBuz fb;
    
    public FizBuzTest() {
        fb=new FizBuz();
    }


    @Test
    public void testAnalisa0() {
        assertEquals("NADA", fb.analisa(0)); 
   }

    @Test
    public void testAnalisa2() {
        assertEquals("FIZ", fb.analisa(2));
    }
    @Test
    public void testAnalisa3() {
        assertEquals("BUZ", fb.analisa(3));
    }
    @Test
    public void testAnalisa6() {
        assertEquals("FIZBUZ", fb.analisa(6));
    }
    @Test
    public void testAnalisa8() {
        assertEquals("FIZ", fb.analisa(8));
    }
    @Test
    public void testAnalisa9() {
        assertEquals("BUZ", fb.analisa(9));
    }
    @Test
    public void testAnalisa12() {
        assertEquals("FIZBUZ", fb.analisa(12));
    }
    
}
