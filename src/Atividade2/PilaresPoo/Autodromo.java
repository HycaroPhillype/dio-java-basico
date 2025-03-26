package Atividade2.PilaresPoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("235874157");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("21587632");
        z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();
    }
}
