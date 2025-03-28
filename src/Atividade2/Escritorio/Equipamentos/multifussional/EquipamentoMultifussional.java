package Atividade2.Escritorio.Equipamentos.multifussional;

import Atividade2.Escritorio.Equipamentos.copiadora.Copiadora;
import Atividade2.Escritorio.Equipamentos.digitalizadora.Digitalizadora;
import Atividade2.Escritorio.Equipamentos.impressora.Impressora;

public class EquipamentoMultifussional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIMAPENTO MULTIFUSSIONAL");
    }
    

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIMAPENTO MULTIFUSSIONAL");
    }
    

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIMAPENTO MULTIFUSSIONAL");
    }
    
}
