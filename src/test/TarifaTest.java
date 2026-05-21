package test;

import decorator.ChuvaDecorator;
import decorator.PicoDecorator;
import decorator.Tarifa;
import decorator.TarifaBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TarifaTest {

    @Test
    public void CalcularTarifaComChuvaEPico() {

        Tarifa tarifa =
                new TarifaBase(20);

        tarifa =
                new ChuvaDecorator(tarifa);

        tarifa =
                new PicoDecorator(tarifa);

        assertEquals(
                28.75,
                tarifa.calcular(),
                0.01
        );
    }

    @Test
    public void CalcularTarifaBase() {

        Tarifa tarifa =
                new TarifaBase(20);

        assertEquals(
                20,
                tarifa.calcular(),
                0.01
        );
    }

    @Test
    public void CalcularTarifaComChuva() {

        Tarifa tarifa =
                new TarifaBase(20);

        tarifa =
                new ChuvaDecorator(tarifa);

        assertEquals(
                23,
                tarifa.calcular(),
                0.01
        );
    }

    @Test
    public void CalcularTarifaComPico() {

        Tarifa tarifa =
                new TarifaBase(20);

        tarifa =
                new PicoDecorator(tarifa);

        assertEquals(
                25,
                tarifa.calcular(),
                0.01
        );
    }
}