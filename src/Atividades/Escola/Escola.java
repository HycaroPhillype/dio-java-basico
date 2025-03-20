package Atividades.Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Felipe Junior");
        felipe.setIdadee(12);

        System.out.println("O aluno "
        .concat(felipe.getNome())
        .concat(" tem ")
        .concat(String.valueOf(felipe.getIdade()))
        .concat(" anos."));
    }
}
