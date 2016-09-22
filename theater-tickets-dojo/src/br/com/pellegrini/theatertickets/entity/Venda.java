package br.com.pellegrini.theatertickets.entity;

import br.com.pellegrini.theatertickets.tipos.TipoIngressoEnum;
import br.com.pellegrini.theatertickets.util.DescontoUtil;
import br.com.pellegrini.theatertickets.util.IngressoUtil;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

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
    private float valorVenda = 0;

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
        buscarIngresso();
        buscarDesconto();

        //Verifica se eh estudante
        if (tipo.equals(TipoIngressoEnum.ESTUDANTE)) {
            //Se apresentou a carteirinha e eh dia de semana
            if (apresentaCarteira && (data.get(Calendar.DAY_OF_WEEK) <= Calendar.FRIDAY || data.get(Calendar.DAY_OF_WEEK) >= Calendar.MONDAY)) {
                desconto = new Desconto();
                desconto.setPercentual(35);
            }
        }

        valorVenda = (ingresso.getValor() - (ingresso.getValor() * desconto.getPercentual() / 100));
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

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        if (this.apresentaCarteira != other.apresentaCarteira) {
            return false;
        }
        if (Float.floatToIntBits(this.valorVenda) != Float.floatToIntBits(other.valorVenda)) {
            return false;
        }
        if (!Objects.equals(this.ingresso, other.ingresso)) {
            return false;
        }
        if (!Objects.equals(this.desconto, other.desconto)) {
            return false;
        }
        if (!Objects.equals(this.data.get(Calendar.DAY_OF_WEEK), other.data.get(Calendar.DAY_OF_WEEK))) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public Desconto getDesconto() {
        return desconto;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public TipoIngressoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngressoEnum tipo) {
        this.tipo = tipo;
    }

    public boolean isApresentaCarteira() {
        return apresentaCarteira;
    }

    public void setApresentaCarteira(boolean apresentaCarteira) {
        this.apresentaCarteira = apresentaCarteira;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    

}
