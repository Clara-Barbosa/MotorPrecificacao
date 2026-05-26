package service;

import model.Pedido;
import model.TipoCategoria;
import strategy.EstrategiaPrecificacao;
import strategy.CalculoPopular;
import strategy.CalculoLuxo;
import decorator.Tarifa;
import decorator.TarifaBase;
import decorator.ChuvaDecorator;
import decorator.PicoDecorator;

public class CalculadoraController {

    public double processarCorrida(Pedido pedido) {
        
        EstrategiaPrecificacao estrategia;
        if (pedido.getTipoCategoria() == TipoCategoria.LUXO) {
            estrategia = new CalculoLuxo();
        } else {
            estrategia = new CalculoPopular();
        }
        
        double precoFrio = estrategia.calcularTarifaBase(pedido);

        Tarifa tarifaFinal = new TarifaBase(precoFrio);

        if (pedido.isEstaChovendo()) {
            tarifaFinal = new ChuvaDecorator(tarifaFinal);
        }

        if (pedido.isHorarioPico()) {
            tarifaFinal = new PicoDecorator(tarifaFinal);
        }

        return tarifaFinal.calcular();
    }
}