package br.com.oo.CAP_14;

import java.util.StringTokenizer;

/**
 * @author William
 */
public class ExemploStringTokenizer {
    public static void main(String[] args) {
        testaStringTokenizer();
    }

    private static void testaStringTokenizer() {
        // StringTokenizer = serve para "quebrar" Strings de mascara ... (?)
        StringTokenizer barras = new StringTokenizer("02/10/1994", "/");

        // Verifica resultados
        while (barras.hasMoreTokens()) {
            String token = barras.nextToken();
            System.out.printf("Token: %s \n", token);
        }

        // Nesse caso ira quebrar os espaços entre as letras
        StringTokenizer letras = new StringTokenizer("AB CD EFG H");

        // Verifica resultados
        while (letras.hasMoreTokens()) {
            String token = barras.nextToken();
            System.out.printf("Token: %s \n", token);
        }
    }
}