package strategy;

import model.Pedido;

public class CalculoPopular implements EstrategiaPrecificacao {

    @Override
    public double calcularTarifaBase(Pedido pedido) {
        double valorBase = (pedido.getDistanciaKm() * 2.00) + (pedido.getTempoMinutos() * 0.50);
        
        return valorBase * 1.0; 
    }
}