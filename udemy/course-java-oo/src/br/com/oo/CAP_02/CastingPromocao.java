package br.com.oo.CAP_02;

/**
 * @author William
 */

// ===== CASTING E PROMOCAO =====
public class CastingPromocao {
    public static void main(String[] args) {
        testaCasting();
    }

    private static void testaCasting() {
        double salario = 500.85;

        // Casting do tipo double para int, porem perde valores
        int novoSalario = (int) salario;

        System.out.println("salario em double : " + salario);
        System.out.println("salario em int : " + novoSalario);
    }
}
