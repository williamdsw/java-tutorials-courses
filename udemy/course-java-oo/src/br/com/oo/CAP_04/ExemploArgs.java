package br.com.oo.CAP_04;

/**
 * @author William
 */
public class ExemploArgs {
    // "args" = Vetor de string que pode ser preenchido pelo CMD
    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[] { " Olá ", " Mundo ", " Com ", " args " };
        }

        // Informacao
        String formatado = "args contém %1s elementos";
        formatado = String.format(formatado, args.length);
        System.out.println(formatado);

        // Itera
        int indice = 0;
        for (String arg : args) {
            formatado = "args[%1s] = %2s";
            formatado = String.format(formatado, indice, arg);
            System.out.println(formatado);
            indice++;
        }
    }
}