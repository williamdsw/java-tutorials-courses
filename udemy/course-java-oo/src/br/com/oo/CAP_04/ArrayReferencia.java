package br.com.oo.CAP_04;

import br.com.oo.CAP_03.Filme;

/**
 * @author William
 */
public class ArrayReferencia {
    public static void main(String[] args) {
        testaReferencia();
    }

    private static void testaReferencia() {
        // Valores
        Filme exorcista = new Filme();
        exorcista.setCodigo(1);
        exorcista.setNome("O Exorcista");
        exorcista.setValor(20.15);

        // Valores
        Filme profecia = new Filme();
        profecia.setCodigo(2);
        profecia.setNome("A Profecia");
        profecia.setValor(15.99);

        // Valores
        Filme sextaFeira13 = new Filme();
        sextaFeira13.setCodigo(3);
        sextaFeira13.setNome("Sexta Feira 13");
        sextaFeira13.setValor(33.01);

        // Array de filmes
        Filme[] filmes = { exorcista, profecia, sextaFeira13 };

        // Itera filmes
        int ordem = 1;
        for (Filme filme : filmes) {
            String formatado = "===== %1sº FILME ===== \n";
            formatado += " Endereço na memória = %2s \n";
            formatado += " Código = %3s \n";
            formatado += " Nome = %4s \n";
            formatado += " Valor = %5s \n";
            formatado = String.format(formatado, ordem, filme, filme.getCodigo(), filme.getNome(), filme.getValor());
            System.out.println(formatado);
            ordem++;
        }
    }
}