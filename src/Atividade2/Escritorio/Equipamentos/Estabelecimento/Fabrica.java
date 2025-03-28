package Atividade2.Escritorio.Equipamentos.Estabelecimento;

import Atividade2.Escritorio.Equipamentos.copiadora.Copiadora;
import Atividade2.Escritorio.Equipamentos.digitalizadora.Digitalizadora;
import Atividade2.Escritorio.Equipamentos.digitalizadora.Scanner;
import Atividade2.Escritorio.Equipamentos.impressora.Deskjet;
import Atividade2.Escritorio.Equipamentos.impressora.Impressora;
import Atividade2.Escritorio.Equipamentos.impressora.Laserjet;
import Atividade2.Escritorio.Equipamentos.multifussional.EquipamentoMultifussional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifussional em = new EquipamentoMultifussional();

        Scanner scanner = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
