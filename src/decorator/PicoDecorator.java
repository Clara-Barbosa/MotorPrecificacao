package decorator;

public class PicoDecorator
        extends TarifaDecorator {

    public PicoDecorator(Tarifa tarifa) {
        super(tarifa);
    }

    @Override
    public double calcular() {
        return tarifa.calcular() * 1.25;
    }
}