package Atividades;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("DIGITE SEU PRIMEIRO NOME: ");
            String nome = scanner.next(); 

            System.out.println("DIGITE SEU SOBRENOME: ");
            String sobrenome = scanner.next();
            
            System.out.println("INFORME SUA IDADE: ");
            int idade = scanner.nextInt(); 

            System.out.println("AGORA INFORME SUA ALTURA: ");
            double altura = scanner.nextDouble(); 

            System.out.println("Olá me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("E tenho " + altura + " de altura");
            scanner.close();
        } 
        catch (InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser númericos.");
        }

        // String nome = args[0];
        // String sobrenome = args[1];
        // int idade = Integer.valueOf(args[2]);
        // double altura = Double.valueOf(args[3]);

        // System.out.println("Olá me chamo " + nome + " " + sobrenome);
        // System.out.println("Tenho " + idade + " anos.");
        // System.out.println("E tenho " + altura + " de altura");



    }
    
}
