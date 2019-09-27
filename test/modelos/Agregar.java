/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Matzi
 */
public class Agregar {
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = null;
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = false;
        boolean result = instance.Agregar(venta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
