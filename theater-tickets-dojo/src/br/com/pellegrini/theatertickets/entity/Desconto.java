package br.com.pellegrini.theatertickets.entity;

import br.com.pellegrini.theatertickets.tipos.TipoIngressoEnum;

/**
 *
 * @author felipe.pellegrini
 */
public class Desconto {
    private float percentual;
    private int diaDaSemana;
    private TipoIngressoEnum tipo;

    public Desconto() {
    }

    public Desconto(float percentual, int diaDaSemana, TipoIngressoEnum tipo) {
        this.percentual = percentual;
        this.diaDaSemana = diaDaSemana;
        this.tipo = tipo;
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }

    public int getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(int diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public TipoIngressoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngressoEnum tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Desconto{" + "percentual=" + percentual + ", diaDaSemana=" + diaDaSemana + ", tipo=" + tipo + '}';
    }
    
    
}
