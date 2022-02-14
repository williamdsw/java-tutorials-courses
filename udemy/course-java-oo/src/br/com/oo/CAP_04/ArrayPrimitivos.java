package br.com.oo.CAP_04;

import java.util.Random;

/**
 * @author William
 */
public class ArrayPrimitivos {
    public static void main(String[] args) {
        testandoArray();
    }

    private static void testandoArray() {
        int[] valores = new int[10];

        // 10 numeros aleatorios entre 0 a 20
        Random random = new Random();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(20);

            // String a ser formatada
            String formatado = "Índice %1s = %2s";
            formatado = String.format(formatado, i, valores[i]);
            System.out.println(formatado);
        }
    }
}