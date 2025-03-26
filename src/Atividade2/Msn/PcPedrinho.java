package Atividade2.Msn;

public class PcPedrinho {
    public static void main(String[] args) {
        MsnMesseger msn = new MsnMesseger();
        msn.enviarMensagem();
        msn.receberMensagem();


        FacebookMensseger facebook = new FacebookMensseger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        TelegramMessenger telegram = new TelegramMessenger();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    
    }

      
}
