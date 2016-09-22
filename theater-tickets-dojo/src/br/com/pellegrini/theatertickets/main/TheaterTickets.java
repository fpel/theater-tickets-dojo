package br.com.pellegrini.theatertickets.main;

import br.com.pellegrini.theatertickets.entity.Venda;
import br.com.pellegrini.theatertickets.tipos.TipoIngressoEnum;
import java.util.Calendar;

/**
 *
 * @author felipe.pellegrini
 */
public class TheaterTickets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calendar data = Calendar.getInstance();
        //data.add(Calendar.DAY_OF_MONTH,2);
        
        Venda v = new Venda(data, TipoIngressoEnum.IDOSO, Boolean.FALSE);
        v.vender();
        
        System.out.println(v.getIngresso().toString());
        System.out.println(v.getDesconto().toString());
        System.out.println("Valor venda:" + v.getValorVenda());
        
    }
        
    
}
