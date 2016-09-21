package br.com.pellegrini.theatertickets.entity;

import br.com.pellegrini.theatertickets.tipos.TipoIngressoEnum;
import br.com.pellegrini.theatertickets.util.DescontoUtil;
import br.com.pellegrini.theatertickets.util.IngressoUtil;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author felipe.pellegrini
 */
public class Venda {
    private List<Ingresso> lstIngresso;
    private List<Desconto> lstDesconto;
    private Ingresso ingresso;
    private Desconto desconto;
    private Calendar data;
    private TipoIngressoEnum tipo;
    private boolean apresentaCarteira = Boolean.FALSE;

    public Venda() {
    }

    public Venda(Calendar data, TipoIngressoEnum tipo, boolean apresentaCarteira) {
        this.data = data;
        this.tipo = tipo;
        this.apresentaCarteira = apresentaCarteira;
        if (lstIngresso==null || lstIngresso.size()<=0) lstIngresso = IngressoUtil.configurarIngressos();
        if (lstDesconto==null || lstDesconto.size()<=0) lstDesconto = DescontoUtil.configurarDescontos();
    }

   
    public void vender() {
        float valorVenda = 0;
        buscarIngresso();
        buscarDesconto();

        //Verifica se eh estudante
        if (tipo.equals(TipoIngressoEnum.ESTUDANTE)) {
            
        } else {
            valorVenda = (ingresso.getValor() - (ingresso.getValor() * desconto.getPercentual() / 100));
        }



        System.out.println(ingresso.toString());
        System.out.println(desconto.toString());
        System.out.println("Valor venda:" + valorVenda);
    }
    
    
    
    private void buscarIngresso() {
        for (Ingresso i : lstIngresso) {
            if (tipo.equals(i.getTipo())) {
                this.ingresso = i;
                break;
            }
        }
    }
    
    
    private void buscarDesconto() {
        if (!apresentaCarteira) {
            for (Desconto d : lstDesconto) {
                if ((data.get(Calendar.DAY_OF_WEEK) == d.getDiaDaSemana()) && (d.getTipo().equals(tipo))) {
                    this.desconto = d;
                    break;
                }
            }
        }
    }
    

}
