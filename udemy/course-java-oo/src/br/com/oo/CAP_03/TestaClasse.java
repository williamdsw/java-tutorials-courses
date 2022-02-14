package br.com.oo.CAP_03;

/**
 * @author William
 */
public class TestaClasse {
    public static void main(String[] args) {
        informacoesClasse();
    }

    private static void informacoesClasse() {
        // Instancia com valores
        Filme filme = new Filme();
        filme.setCodigo(1);
        filme.setNome("O Exorcista");
        filme.setValor(5.75);

        // 6d06d69c = eh o valor da classe Filme no heap (endereco de memoria)
        System.out.println(filme);

        // Printando e pegando valores
        System.out.println("===== DADOS DO FILME =====");
        System.out.println("Código = " + filme.getCodigo());
        System.out.println("Nome = " + filme.getNome());
        System.out.println("Valor = " + filme.getValor());
    }
}