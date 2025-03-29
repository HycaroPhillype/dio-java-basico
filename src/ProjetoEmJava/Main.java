package ProjetoEmJava;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\s+");
        var option = -1;

        do{
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Dar bano no pet.");
            System.out.println("2 - Abastecer máquina com água.");
            System.out.println("3 - Abastecer máquina com shampoo.");
            System.out.println("4 - Verificar água da máquina.");
            System.out.println("5 - Verificar shampoo da máquina.");
            System.out.println("6 - Verificar se tem pet no banho.");
            System.out.println("7 - Conlocar pet na máquina. ");
            System.out.println("8 - Retirar pet da máquina.");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair.");
            try {
                if (scanner.hasNextInt()) {  // ✅ Verifica se há um número inteiro antes de ler
                    option = scanner.nextInt();
                    scanner.nextLine();  // ✅ Limpa o buffer do scanner
                } else {
                    System.out.println("Entrada inválida! Digite um número inteiro.");
                    scanner.nextLine(); // ✅ Descarta entrada inválida
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Erro ao processar entrada! Digite um número inteiro.");
                scanner.nextLine();  // ✅ Evita loop infinito
                continue;
            }

            // Aqui você pode processar a opção escolhida
            System.out.println("Você escolheu a opção: " + option);
            
            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida");
            }

        }while (true);
    }
    private static void setShampoo() {
        System.out.println("Testando colocar shampoo na máquina.");
        petMachine.addShampoo();
    }

    private static void setWater() {
        System.out.println("Testando colocar água na máquina.");
        petMachine.addWater();
    }

    private static void verifyWater(){
        var amount = petMachine.getWater();
                    System.out.println("A máquina está no comento "
                    .concat(String.valueOf(amount))
                    .concat(" litros de água."));
    }

    private static void verifyShampoo(){
        var amount = petMachine.getShampoo();
                    System.out.println("A máquina está no comento "
                    .concat(String.valueOf(amount))
                    .concat(" litros de shampoo."));
    }

    private static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina.");
    }

    public static void setPetMachine(){
        var name = "";

        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            name = (String) scanner.nextLine();
        }
        var pet = new Pet((String) name);
        petMachine.setPet(pet);
        System.out.println("O pet "
        .concat(pet.getName())
         .concat(" foi colocado ná máquina"));
    }

   
}
