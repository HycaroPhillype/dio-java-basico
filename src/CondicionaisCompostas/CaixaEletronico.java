package CondicionaisCompostas;

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 2500.0;
        
        System.out.println("DIGITE SEU NOME POR FAVOR: ");
        String nome = scanner.next();

        System.out.println("Olá "
            .concat(nome)
            .concat(" Seu saldo atual é de: "
            .concat(String.valueOf(saldo)))
            .concat(" R$ reais, Quanto o senhor deseja sacar? "));

        double valorSolicitado = scanner.nextDouble();

        double saldoAtualizado = saldo - valorSolicitado;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            String mensagem = "Você sacou "
                .concat(String.valueOf(valorSolicitado))
                .concat(" R$ Reais do seu saldo. Saldo atualizdo: ")
                .concat(String.valueOf(saldoAtualizado)
                .concat(" R$ reais"));

            System.out.println(mensagem);
        }else
            System.out.println("Desculpe, saldo insuficiente.");
            
    }
    
}
