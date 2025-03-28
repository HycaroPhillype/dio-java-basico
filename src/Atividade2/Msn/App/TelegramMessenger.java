package Atividade2.Msn.App;

public class TelegramMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo TELEGRAM...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo TELEGRAM...");
    }

}
