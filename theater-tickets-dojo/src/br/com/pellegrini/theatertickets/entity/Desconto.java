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

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Desconto other = (Desconto) obj;
        if (Float.floatToIntBits(this.percentual) != Float.floatToIntBits(other.percentual)) {
            return false;
        }
        if (this.diaDaSemana != other.diaDaSemana) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }
    
    
}
