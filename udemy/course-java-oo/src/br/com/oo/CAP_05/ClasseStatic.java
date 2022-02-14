package br.com.oo.CAP_05;

/**
 * @author William
 */
public class ClasseStatic {
    private static int contador;

    public ClasseStatic(String texto) {
        System.out.println(texto);
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}