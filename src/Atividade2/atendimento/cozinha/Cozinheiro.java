package Atividade2.atendimento.cozinha;

import Atividade2.atendimento.Atendente;

public class Cozinheiro {
    public  void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LACHE NATURAL HAMBURGER NO BALCÃO");
    }

    public void adicionarSuco() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    public void addComboBalcao() {
        adicionarLancheNoBalcao();
        adicionarSuco();
    }

    private void prepararLache() {
        System.out.println("PREPARANDO LANCHE TIPO HUMBURGER");
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararCombo() {
        prepararLache();
        prepararVitamina();
    }

    private void selectIngredienteLanche() {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }

    private void selectIngredienteVitamina() {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }

    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E O OVO PARA O HUMBURGER");
    }

    private void pedirParaTrocarGas(Almoxarifado meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarifado almoxarifado) {
        almoxarifado.entregarIngredientes();
    }


}
