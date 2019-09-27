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
public class subTotal {
    @Test
    public void testSubTotal() {
        System.out.println("subTotal");
        String codigo = "venta001";
        Venta venta=new Venta("venta001", 500, 2);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        int expResult = 1000;
        int result = instance.subTotal(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
