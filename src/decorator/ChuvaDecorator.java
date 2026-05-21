package decorator;

public class ChuvaDecorator
        extends TarifaDecorator {

    public ChuvaDecorator(Tarifa tarifa) {
        super(tarifa);
    }

    @Override
    public double calcular() {
        return tarifa.calcular() * 1.15;
    }
}
