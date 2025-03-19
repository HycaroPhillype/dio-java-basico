package Atividade2.lanchonete;

import Atividade2.areaCliente.Cliente;
import Atividade2.atendimento.Atendente;
import Atividade2.atendimento.cozinha.Almoxarifado;
import Atividade2.atendimento.cozinha.Cozinheiro;

public class Estabelicimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarSuco();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.addComboBalcao();

        Almoxarifado almoxarifado = new Almoxarifado();

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();
        

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }
    
} 
