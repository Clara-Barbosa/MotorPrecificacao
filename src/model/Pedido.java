package model;

public class Pedido {
    private final double distanciaKm;
    private final int tempoMinutos;
    private final boolean estaChovendo;
    private final boolean horarioPico;
    private final TipoCategoria tipoCategoria;

    public Pedido(double distanciaKm,
                  int tempoMinutos,
                  boolean estaChovendo,
                  boolean horarioPico,
                  TipoCategoria tipoCategoria) {

        this.distanciaKm = distanciaKm;
        this.tempoMinutos = tempoMinutos;
        this.estaChovendo = estaChovendo;
        this.horarioPico = horarioPico;
        this.tipoCategoria = tipoCategoria;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public boolean isEstaChovendo() {
        return estaChovendo;
    }

    public boolean isHorarioPico() {
        return horarioPico;
    }

    public TipoCategoria getTipoCategoria() {
        return tipoCategoria;
    }
    
        public int getTempoMinutos() {
        return tempoMinutos;
    }
}
