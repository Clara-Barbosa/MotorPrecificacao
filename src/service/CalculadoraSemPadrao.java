package service;
//codigo sem decorator
public class CalculadoraSemPadrao {

    public double calcular(
            double valorBase,
            boolean chuva,
            boolean horarioPico
    ) {

        double valor = valorBase;

        if (chuva) {
            valor = valor * 1.15;
        }

        if (horarioPico) {
            valor = valor * 1.25;
        }

        return valor;
    }
}
