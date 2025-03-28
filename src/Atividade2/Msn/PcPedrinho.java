package Atividade2.Msn;

import Atividade2.Msn.App.FacebookMensseger;
import Atividade2.Msn.App.MsnMesseger;
import Atividade2.Msn.App.ServicoMensagemInstantanea;
import Atividade2.Msn.App.TelegramMessenger;

public class PcPedrinho {
    public static void main(String[] args) {
    ServicoMensagemInstantanea smi = null;
    
    String appEscolhido = "telegram";

    if( appEscolhido.equals("msn"))
        smi = new MsnMesseger();
    else if(appEscolhido.equals("facebook"))
        smi = new FacebookMensseger();
    else if(appEscolhido.equals("telegram"))
        smi = new TelegramMessenger();

    smi.enviarMensagem();
    smi.receberMensagem();

    }
}
