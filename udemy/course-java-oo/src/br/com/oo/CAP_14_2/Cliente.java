package br.com.oo.CAP_14_2;

/**
 * @author William
 */
public class Cliente {
    private String nome;
    private long cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String value) {
        this.nome = value;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long value) {
        this.cpf = value;
    }
}