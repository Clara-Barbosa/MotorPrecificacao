import decorator.*;

public class Main {

    public static void main(String[] args) {

        Tarifa tarifa =
                new TarifaBase(20);

        tarifa =
                new ChuvaDecorator(tarifa);

        tarifa =
                new PicoDecorator(tarifa);

        System.out.println(
                tarifa.calcular()
        );
    }
}