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
public class Modificar {
     @Test
    public void testModificar() {
        System.out.println("modificar");
        Venta venta = new Venta("Venta001", 500, 2);
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = false;
        boolean result = instance.Modificar(venta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
