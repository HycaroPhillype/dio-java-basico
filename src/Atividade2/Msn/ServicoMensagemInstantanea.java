package Atividade2.Msn;

public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem...");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem...");
    }

    private void validarConexaoInternet() {
        System.out.println("Validando se está conectado a internet...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórioco de mensagens...");
    }
}
