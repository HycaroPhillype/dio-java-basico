package Atividade2.atendimento;

public class Atendente {
    public void servindoMesa() {
        pegarLancheCozinha();
        System.out.println("SERVINDO MESA");
    }

    private void pegarLancheCozinha() {
        System.out.println("PEGANDO O LANCHE NA COZINHA");
    }

    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
    }

    void trocarGas() {
        System.out.println("ATENDENTE TROCANDO GÁS");
    }

    public void pegarPedidoBalcao() {
        System.out.println("PEGANDO  PEDIDO NO BALCÃO");
    }
}
