package Atividade2.Msn.App;

public class FacebookMensseger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo FACEBOOK...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo FACEBOOK...");
    }

    
}
