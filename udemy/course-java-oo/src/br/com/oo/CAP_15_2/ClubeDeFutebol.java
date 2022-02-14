package br.com.oo.CAP_15_2;

/**
 * @author William
 */
public class ClubeDeFutebol {
    private String nome;
    private int numeroDePontos;

    public ClubeDeFutebol(String pNome, int pNumeroDePontos) {
        this.nome = pNome;
        this.numeroDePontos = pNumeroDePontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String value) {
        this.nome = value;
    }

    public int getNumeroDePontos() {
        return numeroDePontos;
    }

    public void setNumeroDePontos(int value) {
        this.numeroDePontos = value;
    }
}