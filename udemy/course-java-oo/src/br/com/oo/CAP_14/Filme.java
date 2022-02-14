package br.com.oo.CAP_14;

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
    public String toString() {
        String info = "===== INFORMACOES DO FILME ===== \n" +
                " CODIGO = %1s\n" +
                " NOME = %2s\n" +
                " VALOR = %3s\n";

        return String.format(info, this.getCodigo(), this.getNome(), this.getValor());
    }
}