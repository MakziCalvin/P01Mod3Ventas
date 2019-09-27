/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Matzi
 */
public class Listar {
    @Test
    public void testListar() {
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> expResult = new ArrayList<>();
        ArrayList<Venta> result = instance.Listar();
        assertEquals(expResult, result);
       
        //fail("The test case is a prototype.");
    }
}
