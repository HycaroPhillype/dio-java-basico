package Atividade2.PilaresPoo;

public class Carro extends Veiculo {
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
   
    private void confereCombustivel() {
        System.out.println("Conferindo combustivél");
    }

    private void confereCambio() {
        System.out.println("Conferindo se o câmbio está no 'P'");
    }
    
    
}
