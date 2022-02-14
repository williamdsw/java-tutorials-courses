package br.com.oo.CAP_15;

import br.com.oo.CAP_03.Filme;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author William
 */
public class ExemploIterator {
    public static void main(String[] args) {
        testaIterator();
    }

    private static void testaIterator() {
        // SEMPRE PROGRAMAR VOLTADO A INTERFACES
        // Implementando Collection com HashSet
        Collection<Filme> filmes = new HashSet<>();

        // Valores
        Filme terror = new Filme();
        terror.setCodigo(1);
        terror.setNome("O Exorcista");
        terror.setValor(19.73);

        Filme suspense = new Filme();
        suspense.setCodigo(2);
        suspense.setNome("Se7en");
        suspense.setValor(19.95);

        Filme aventura = new Filme();
        aventura.setCodigo(3);
        aventura.setNome("Homem Aranha");
        aventura.setValor(20.17);

        Filme acao = new Filme();
        acao.setCodigo(4);
        acao.setNome("Duro de Matar");
        acao.setValor(19.85);

        Filme ficcao = new Filme();
        ficcao.setCodigo(5);
        ficcao.setNome("Efeito Borboleta");
        ficcao.setValor(20.04);

        // Lista com valores
        filmes.add(terror);
        filmes.add(suspense);
        filmes.add(aventura);
        filmes.add(acao);
        filmes.add(ficcao);

        // Iterando a colecao
        Iterator<Filme> iterador = filmes.iterator();
        while (iterador.hasNext()) {
            Filme filme = iterador.next();
            System.out.println(filme.getNome());
        }
    }
}