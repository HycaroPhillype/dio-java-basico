package Atividade2.atendimento.cozinha;

public class Almoxarifado {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DE INTENS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLANDO SAÍDA DOS INTENS");
    }

    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("ALMOXARIFADO TROCANDO GÁS");
    }

}
