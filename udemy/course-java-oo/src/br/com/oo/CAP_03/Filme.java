package br.com.oo.CAP_03;

import java.util.Objects;

/**
 * @author William
 */
public class Filme {
    private int codigo;
    private String nome;
    private double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int value) {
        this.codigo = value;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String value) {
        this.nome = value;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double value) {
        this.valor = value;
    }

    @Override
    public boolean equals(Object object) {
        // Se objetos forem iguais
        if (this == object) {
            return true;
        }

        // Se objetos forem diferentes
        if (object == null) {
            return false;
        }

        // Se as classes dos objetos forem diferentes
        if (getClass() != object.getClass()) {
            return false;
        }

        // Compara ambos
        final Filme other = (Filme) object;
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = (67 * hash + Objects.hashCode(this.nome));
        return hash;
    }

    @Override
    public String toString() {
        String info = "\n===== INFORMACOES DO FILME ===== \n" +
                " CODIGO = %1s\n" +
                " NOME = %2s\n" +
                " VALOR = %3s";

        return String.format(info, this.getCodigo(), this.getNome(), this.getValor());
    }
}