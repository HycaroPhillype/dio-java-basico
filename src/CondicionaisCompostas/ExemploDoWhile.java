package CondicionaisCompostas;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

        System.out.println("DISCANDO...");
        
        do{
            System.out.println("TELEFONE TOCANDO");
        }while(tocando());
            System.out.println("ALÔ !!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Antendeu? ".concat(String.valueOf(atendeu)));

        return ! atendeu;
    }
}
