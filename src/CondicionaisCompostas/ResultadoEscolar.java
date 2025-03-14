package CondicionaisCompostas;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        
        String resultado = nota >= 7 ? "APROVADO" : nota >= 5 && nota < 7 ? "RECUPERAÇÃO" : "REPROVADO";
        System.out.println("Você está ".concat(resultado))

        // String resultado = nota >= 7 ? "APROVADO" : "REPROVADO";
        // System.out.println("Você está ".concat(resultado))
        ;
        // if (nota >= 7) 
        //     System.out.println("APROVADO");
        
        // else if (nota >= 5 && nota <7)
        //     System.out.println("FAZER PROVA DE RECUPERAÇÃO");
        // else
        //     System.out.println("REPROVADO");
        
    }
}
 