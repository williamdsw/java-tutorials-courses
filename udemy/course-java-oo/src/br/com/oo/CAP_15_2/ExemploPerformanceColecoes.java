package br.com.oo.CAP_15_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author William
 */
public class ExemploPerformanceColecoes {
    private final static int NUMERO_TOTAL_OCORRENCIAS = 10000;

    public static void main(String[] args) {
        exemploPerformanceArrayList();
        exemploPerformanceLinkedList();
        exemploPerformanceHashSet();
    }

    public static void exemploPerformanceArrayList() {
        System.out.println("\n===== Iniciando com ArrayList =====");
        long inicio = System.currentTimeMillis();

        // Adiciona
        System.out.println("===== Adicionando ao ArrayList ===== ");
        Collection<Integer> pares = new ArrayList<>();
        for (int i = 0; i < NUMERO_TOTAL_OCORRENCIAS; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            }
        }

        // Verifica
        System.out.println("===== Verificando no ArrayList ===== ");
        for (int i = 0; i < NUMERO_TOTAL_OCORRENCIAS; i++) {
            pares.contains(i);
        }

        // Exibe tempo gasto
        long fim = System.currentTimeMillis();
        long tempoGasto = (fim - inicio);
        System.out.printf("%d itens manipulados em %s ms \n", pares.size(), tempoGasto);
    }

    public static void exemploPerformanceLinkedList() {
        System.out.println("\n===== Iniciando com LinkedList =====");
        long inicio = System.currentTimeMillis();

        // Adiciona
        System.out.println("===== Adicionando ao LinkedList ===== ");
        Collection<Integer> pares = new LinkedList<>();
        for (int i = 0; i < NUMERO_TOTAL_OCORRENCIAS; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            }
        }

        // Verifica
        System.out.println("===== Verificando no LinkedList ===== ");
        for (int i = 0; i < NUMERO_TOTAL_OCORRENCIAS; i++) {
            pares.contains(i);
        }

        // Exibe tempo gasto
        long fim = System.currentTimeMillis();
        long tempoGasto = (fim - inicio);
        System.out.printf("%d itens manipulados em %s ms \n", pares.size(), tempoGasto);
    }

    public static void exemploPerformanceHashSet() {
        System.out.println("\n===== Iniciando com HashSet =====");
        long inicio = System.currentTimeMillis();

        // Adiciona
        System.out.println("===== Adicionando ao HashSet ===== ");
        Collection<Integer> pares = new HashSet<>();
        for (int i = 0; i < NUMERO_TOTAL_OCORRENCIAS; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            }
        }

        // Verifica
        System.out.println("===== Verificando no HashSet ===== ");
        for (int i = 0; i < NUMERO_TOTAL_OCORRENCIAS; i++) {
            pares.contains(i);
        }

        // Exibe tempo gasto
        long fim = System.currentTimeMillis();
        long tempoGasto = (fim - inicio);
        System.out.printf("%d itens manipulados em %s ms \n", pares.size(), tempoGasto);
    }
}