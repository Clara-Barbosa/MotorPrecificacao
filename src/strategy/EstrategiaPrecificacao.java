package strategy;
import model.Pedido;

public interface EstrategiaPrecificacao {
    double calcularTarifaBase (Pedido pedido);
}
