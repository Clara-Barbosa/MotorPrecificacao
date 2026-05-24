package builder;

import model.Pedido;
import model.TipoCategoria;

public class PedidoBuilder {
    private double distanciaKm;
    private int tempoMinutos;
    private boolean estaChovendo = false;
    private boolean horarioPico = false;
    private TipoCategoria tipoCategoria = TipoCategoria.POPULAR;

    public PedidoBuilder comDistancia (Double distanciaKm) {
        this.distanciaKm = distanciaKm;
        return this;
    }

    public PedidoBuilder comTempo(int tempoMinutos) {
        this.tempoMinutos = tempoMinutos;
        return this;
    }

    public PedidoBuilder comChuva (boolean estaChovendo) {
        this.estaChovendo = estaChovendo;
        return this;
    }

    public PedidoBuilder noHorarioPico(boolean horarioPico) {
        this.horarioPico = horarioPico;
        return this;
    }

    public PedidoBuilder comTipoCategoria(TipoCategoria tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
        return this;
    }

    public Pedido build() {
        return new Pedido (distanciaKm, tempoMinutos,
                estaChovendo, horarioPico, tipoCategoria);
    }
    
    public int getTempoMinutos() {
        return tempoMinutos;
    }
}
