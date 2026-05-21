package model;

public class Pedido {

    private double distancia;
    private boolean chuva;
    private boolean horarioPico;
    private String tipoCorrida;

    public Pedido(double distancia,
                  boolean chuva,
                  boolean horarioPico,
                  String tipoCorrida) {

        this.distancia = distancia;
        this.chuva = chuva;
        this.horarioPico = horarioPico;
        this.tipoCorrida = tipoCorrida;
    }

    public double getDistancia() {
        return distancia;
    }

    public boolean isChuva() {
        return chuva;
    }

    public boolean isHorarioPico() {
        return horarioPico;
    }

    public String getTipoCorrida() {
        return tipoCorrida;
    }
}