package CondicionaisCompostas;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B";

        switch (plano) {
            case "T":
                System.out.println("5gb YouTube.");
                
            case "M": 
                System.out.println("Whats e Instagram grátis.");
            case "B":
                System.out.println("100 minutos de ligação.");
        }

        // if (plano == "B") {
        //     System.out.println("100 minutos de ligação");
        // }else if(plano == "M") {
        //     System.out.println("100 minutos de ligação, Whats e Instagram gratís.");
        // }else if(plano == "T") {
        //     System.out.println("100 minutos de ligação, Whats e Istagram grátis e 5 gb de YouTube.");
        // }
    }
    
}
