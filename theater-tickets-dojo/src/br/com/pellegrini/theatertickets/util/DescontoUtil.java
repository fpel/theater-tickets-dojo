package br.com.pellegrini.theatertickets.util;

import br.com.pellegrini.theatertickets.entity.Desconto;
import br.com.pellegrini.theatertickets.tipos.TipoIngressoEnum;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author felipe.pellegrini
 */
public class DescontoUtil {
    
    public static List<Desconto> configurarDescontos() {
        List<Desconto> lstDesconto = new ArrayList<>();
        
        //Segunda
        lstDesconto.add(new Desconto(10, Calendar.MONDAY, TipoIngressoEnum.CRIANCA));
        lstDesconto.add(new Desconto(10, Calendar.MONDAY, TipoIngressoEnum.ESTUDANTE));
        lstDesconto.add(new Desconto(10, Calendar.MONDAY, TipoIngressoEnum.IDOSO));
        //Terca
        lstDesconto.add(new Desconto(15, Calendar.TUESDAY, TipoIngressoEnum.CRIANCA));
        lstDesconto.add(new Desconto(5, Calendar.TUESDAY, TipoIngressoEnum.ESTUDANTE));
        lstDesconto.add(new Desconto(15, Calendar.TUESDAY, TipoIngressoEnum.IDOSO));
        //Quarta
        lstDesconto.add(new Desconto(30, Calendar.WEDNESDAY, TipoIngressoEnum.CRIANCA));
        lstDesconto.add(new Desconto(50, Calendar.WEDNESDAY, TipoIngressoEnum.ESTUDANTE));
        lstDesconto.add(new Desconto(40, Calendar.WEDNESDAY, TipoIngressoEnum.IDOSO));
        //Quinta
        lstDesconto.add(new Desconto(0, Calendar.THURSDAY, TipoIngressoEnum.CRIANCA));
        lstDesconto.add(new Desconto(30, Calendar.THURSDAY, TipoIngressoEnum.ESTUDANTE));
        lstDesconto.add(new Desconto(30, Calendar.THURSDAY, TipoIngressoEnum.IDOSO));
        //Sexta
        lstDesconto.add(new Desconto(11, Calendar.FRIDAY, TipoIngressoEnum.CRIANCA));
        lstDesconto.add(new Desconto(0, Calendar.FRIDAY, TipoIngressoEnum.ESTUDANTE));
        lstDesconto.add(new Desconto(0, Calendar.FRIDAY, TipoIngressoEnum.IDOSO));
        //Sabado
        lstDesconto.add(new Desconto(0, Calendar.SATURDAY, TipoIngressoEnum.CRIANCA));
        lstDesconto.add(new Desconto(0, Calendar.SATURDAY, TipoIngressoEnum.ESTUDANTE));
        lstDesconto.add(new Desconto(5, Calendar.SATURDAY, TipoIngressoEnum.IDOSO));
        //Domingo
        lstDesconto.add(new Desconto(0, Calendar.SUNDAY, TipoIngressoEnum.CRIANCA));
        lstDesconto.add(new Desconto(0, Calendar.SUNDAY, TipoIngressoEnum.ESTUDANTE));
        lstDesconto.add(new Desconto(5, Calendar.SUNDAY, TipoIngressoEnum.IDOSO));
        
        
        //Ordena
        Collections.sort(lstDesconto, new Comparator<Desconto>() {
            @Override
            public int compare(Desconto d1, Desconto d2) {
                if (d1.getDiaDaSemana() < d2.getDiaDaSemana())
                    return 1;
                if (d1.getDiaDaSemana() > d2.getDiaDaSemana())
                    return -1;
                return 0;
            }
        });
        
        return lstDesconto;
    }


}
