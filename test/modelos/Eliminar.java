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
public class Eliminar {
     @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String codigo = "venta001";
        Venta venta=new Venta("venta001", 500, 2);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean expResult = true;
        boolean result = instance.Eliminar(codigo);
        assertEquals(expResult, result);
        
    }
}
