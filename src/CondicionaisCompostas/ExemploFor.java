package CondicionaisCompostas;

public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = { "PATO", "FELIPE", "EDIMARA", "MAYA MARIA"};

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: ".concat(aluno));
        }
    //     for (int x = 0; x < alunos.length; x ++) {
    //         System.out.println("O aluno no índice x= ".concat(String.valueOf(x)).concat(" é ").concat(alunos[x]));
    //     }
     }
}
