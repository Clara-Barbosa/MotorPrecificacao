import builder.PedidoBuilder;
import model.Pedido;
import model.TipoCategoria;
import service.CalculadoraController;

public class Main {

    public static void main(String[] args) {

        System.out.println("-- Testando o Motor de Precificação --");

        // Builder
        Pedido meuPedido = new PedidoBuilder()
                .comDistancia(10.0) // 10 km
                .comTempo(20)       // 20 minutos
                .comTipoCategoria(TipoCategoria.LUXO) // Categoria Luxo
                .comChuva(true)     // Com chuva
                .noHorarioPico(true) // horário de pico
                .build();

        // controller
        CalculadoraController controller = new CalculadoraController();
        double precoFinal = controller.processarCorrida(meuPedido);

        // resultado
        System.out.println("Preço final da corrida: R$ " + precoFinal);
    }
}