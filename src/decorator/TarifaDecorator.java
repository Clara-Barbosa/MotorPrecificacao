package decorator;

public abstract class TarifaDecorator
        implements Tarifa {

    protected Tarifa tarifa;

    public TarifaDecorator(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
}