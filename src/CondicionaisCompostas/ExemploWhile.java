package CondicionaisCompostas;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleantorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: ".concat(String.valueOf(valorDoce)).concat("Adicionando no carrinho"));
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada".concat(String.valueOf(mesada)));
        System.out.println("Joãozinho gastou toda a sua mesada em doces");


    }

    private static double valorAleantorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
