package Atividade2;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo", 55),
    RIO_JANEIRO ( "RJ", "Rio de Janeiro", 65),
    MARANHAO ("MA", "Maranhão", 47),
    CEARA ("CE", "Ceará", 25)
    ;

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }
    public int getIbge() {
        return ibge;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaisculo() {
        return nome.toUpperCase();
    }


}
