package br.com.oo.CAP_15;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author William
 */
public class ExemploArrayList {
    public static void main(String[] args) {
        testaArray();
    }

    // Arrays = Sao estaticos (tamanho estatico)
    // Listas = Sao dinamicas (crescem de forma dinamicamente)
    private static void testaArray() {
        // ArrayList que aceita varios tipos
        // ArrayList nomes = new ArrayList ();

        // Array list que aceita apenas Strings
        ArrayList<String> nomes = new ArrayList<>();

        // Valores
        nomes.add("Dave Mustaine");
        nomes.add("Nick Menza");
        nomes.add("Marty Friedman");
        nomes.add("Nick Menza");
        nomes.add("David Ellefson");

        // Funcoes
        System.out.printf("Primeiro nome: %s \n", nomes.get(0));
        System.out.printf("Todos os itens do ArrayList: %s \n", nomes.toString());
        nomes.remove(3);
        System.out.printf("Todos os itens do ArrayList: %s \n", nomes.toString());
        System.out.printf("Contem Dave Mustaine ? %s \n", (nomes.contains("Dave Mustaine") ? "Sim" : "Não"));

        if (nomes.isEmpty()) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("A lista não está vazia");
        }

        System.out.println("Ordenando a lista");
        Collections.sort(nomes);

        // Exibe
        System.out.println(nomes.toString());
    }
}