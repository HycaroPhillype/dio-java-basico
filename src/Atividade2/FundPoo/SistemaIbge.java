package Atividade2.FundPoo;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
           System.out.println(e.getSigla().concat(" - ").concat(e.getNome())); 
        }

        EstadoBrasileiro eb = EstadoBrasileiro.MARANHAO;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaisculo());
        System.out.println(eb.getIbge());

    }
}
