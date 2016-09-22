package br.com.pellegrini.theatertickets.entity;

import br.com.pellegrini.theatertickets.tipos.TipoIngressoEnum;
import java.util.Calendar;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felipe.pellegrini
 */
public class VendaTest {
    
    public VendaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of vender method, of class Venda.
     */
    @Test
    public void testVender() {
        System.out.println("vender");
        Calendar data = Calendar.getInstance();
        data.add(Calendar.DAY_OF_WEEK, 7); //semana que vem
        
        Venda instance = new Venda(Calendar.getInstance(), TipoIngressoEnum.IDOSO, Boolean.FALSE);
        instance.vender();
        
        Venda inst1 = new Venda(Calendar.getInstance(), TipoIngressoEnum.IDOSO, Boolean.FALSE);
        inst1.vender();
        
        Venda inst2 = new Venda(data, TipoIngressoEnum.IDOSO, Boolean.FALSE);
        inst2.vender();
        
        Venda inst3 = new Venda(data, TipoIngressoEnum.CRIANCA, Boolean.TRUE);
        inst2.vender();

        assertEquals(instance, inst1);
        assertEquals(instance, inst2);
        assertNotEquals(instance, inst3);
        
        
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
 
}
