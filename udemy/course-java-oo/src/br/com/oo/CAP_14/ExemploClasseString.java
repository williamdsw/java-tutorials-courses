package br.com.oo.CAP_14;

/**
 * @author William
 */
public class ExemploClasseString {
    public static void main(String[] args) {
        testaClasseString();
    }

    private static void testaClasseString() {
        // Dados
        Filme filme = new Filme();
        filme.setCodigo(1);
        filme.setNome("O Exorcista");
        filme.setValor(666.66);

        // Exibe informacao do toString () sobreescrito
        System.out.println(filme.toString());
    }
}