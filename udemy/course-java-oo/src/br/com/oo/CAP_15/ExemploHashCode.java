package br.com.oo.CAP_15;

import br.com.oo.CAP_03.Filme;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author William
 */
public class ExemploHashCode {
    public static void main(String[] args) {
        testaHashCode();
    }

    private static void testaHashCode() {
        // Implementando Collection com ArrayList
        // Pesquisa com HashSet e mais rapida do que com ArrayList
        // Collection<Filme> filmes = new ArrayList<> ();
        Collection<Filme> filmes = new HashSet<>();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("========== CADASTRO DE FILMES ==========");

            String prosseguir = "s";

            // Executa enquanto informar a string 's'
            while ("s".equalsIgnoreCase(prosseguir)) {
                // Dados
                System.out.println("Nome: ");
                String nome = scanner.nextLine();
                System.out.println("Valor R$: ");
                String valor = scanner.nextLine();

                // Passando pra instancia
                Filme filme = new Filme();
                filme.setNome(nome);
                filme.setValor(Double.parseDouble(valor));

                // Verifica no ArrayList
                if (filmes.contains(filme)) {
                    System.out.println("Filme já foi adicionado");
                } else {
                    filmes.add(filme);
                    System.out.println("Filme adicionado com sucesso");
                }

                // Codigo para cada instancia
                System.out.printf("Hash Code : %d \n", filme.hashCode());
                System.out.println("Deseja adicionar outro filme? (s/n)");
                prosseguir = scanner.nextLine();
            }

            // Exibe valores da lista
            System.out.println("Lista de Filmes:");
            filmes.forEach((Filme filme) -> System.out.println(filme.getNome()));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}