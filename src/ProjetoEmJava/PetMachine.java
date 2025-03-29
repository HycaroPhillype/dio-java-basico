package ProjetoEmJava;

public class PetMachine {
    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na maquina para inciar o banho");
            return;
        }
        
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("o pet "
        .concat(pet.getName())
        .concat(" está limpo."));        
        
    }

    public void addWater() {
        if ( water == 30) {
            System.out.println("A capacidade de águal da maquina está no máximo");
            return;
        }

        water +=2;
    }

    public void addShampoo() {
        if ( shampoo == 10) {
            System.out.println("A capacidade de shampoo da maquina está no máximo");
            return;
        }

        shampoo +=2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (this.clean){
            System.out.println("A maquina está suja para colocar o pet é, necessário limpa-la!");
            return;
        }
        if (this.pet != null){
            System.out.println("O pet "
            .concat(this.pet.getName())
            .concat(" está na máquina nesse momento."));

            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.inClean();
        System.out.println("O Pet "
        .concat(this.pet.getName())
        .concat(" está limpo."));
        this.pet = null;

    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;

        System.out.println("A máquina está limpa.");
    }
    
}
