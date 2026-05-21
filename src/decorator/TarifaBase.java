package decorator;

public class TarifaBase implements Tarifa {

    private double valor;

    public TarifaBase(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return valor;
    }
}