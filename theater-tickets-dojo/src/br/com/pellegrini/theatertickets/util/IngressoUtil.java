package br.com.pellegrini.theatertickets.util;

import br.com.pellegrini.theatertickets.entity.Ingresso;
import br.com.pellegrini.theatertickets.tipos.TipoIngressoEnum;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe.pellegrini
 */
public class IngressoUtil {
    
    public static List<Ingresso> configurarIngressos() {
        List<Ingresso> lstIngresso = new ArrayList<>();
        
        Ingresso iCrianca = new Ingresso(TipoIngressoEnum.CRIANCA, new Float(5.5));
        Ingresso iEstudante = new Ingresso(TipoIngressoEnum.ESTUDANTE, new Float(8));
        Ingresso iIdoso = new Ingresso(TipoIngressoEnum.IDOSO, new Float(6));
        
        lstIngresso.add(iCrianca);
        lstIngresso.add(iEstudante);
        lstIngresso.add(iIdoso);

        return lstIngresso;
    }
    
    
}
