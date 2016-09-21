
package br.com.pellegrini.theatertickets.entity;

import br.com.pellegrini.theatertickets.tipos.TipoIngressoEnum;
import java.math.BigDecimal;

/**
 *
 * @author felipe.pellegrini
 */
public class Ingresso {
    private TipoIngressoEnum tipo;
    private float valor;

    public Ingresso(TipoIngressoEnum tipo, float valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public TipoIngressoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngressoEnum tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    

    @Override
    public String toString() {
        return "Ingresso{" + "tipo=" + tipo + ", valor=" + valor + '}';
    }
    
}
