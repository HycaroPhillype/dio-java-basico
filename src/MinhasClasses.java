public class MinhasClasses {
    
public static void main (String [] args) {
    // String meunome = "hycaro";

    // int anoFabricado = 2025;

    // boolean simNao = true;
    // anoFabricado = 2027;
    
    // int somar (int n1, int n2);

    // String formatarCep(long cep);
    String primeiroNome = "Hycaro";
    String segundoNome = "Phillype";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto); // isso e para printar no terminal, 

};

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return " Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}
    
}
