package br.com.oo.CAP_02;

/**
 * @author William
 */

// ===== TIPOS PRIMITIVOS EM JAVA =====
public class TiposPrimitivos {
    public static void main(String[] args) {
        exibeInformacoes();
    }

    private static void exibeInformacoes() {
        // Integers
        byte idade = 127;
        short distancia = 32767;
        int numero = 2147483647;
        long cpf = 22504102899L;

        // Ponto Flutuante
        float pi = 3.14f;
        double salario = 800.50;

        // boolean
        boolean maiorIdade = true;

        // char e String
        char letra = 'W';
        String nome = "William";

        // Printando
        System.out.println("byte = " + idade);
        System.out.println("short = " + distancia);
        System.out.println("int = " + numero);
        System.out.println("long = " + cpf);
        System.out.println("float = " + pi);
        System.out.println("double = " + salario);
        System.out.println("boolean = " + maiorIdade);
        System.out.println("char = " + letra);
        System.out.println("String = " + nome);
    }
}