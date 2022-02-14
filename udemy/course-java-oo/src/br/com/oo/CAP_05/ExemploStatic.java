package br.com.oo.CAP_05;

/**
 * @author William
 */
public class ExemploStatic {
    public static void main(String[] args) {
        testaStatic();
    }

    private static void testaStatic() {
        // Instancias e contador
        ClasseStatic primeiro = new ClasseStatic("Chamando pela 1ª vez");
        System.out.println("contador = " + ClasseStatic.getContador());

        ClasseStatic segundo = new ClasseStatic("Chamando pela 2ª vez");
        System.out.println("contador = " + ClasseStatic.getContador());

        ClasseStatic terceiro = new ClasseStatic("Chamando pela 3ª vez");
        System.out.println("contador = " + ClasseStatic.getContador());

        ClasseStatic quarta = new ClasseStatic("Chamando pela 4ª vez");
        System.out.println("contador = " + ClasseStatic.getContador());

        ClasseStatic quinta = new ClasseStatic("Chamando pela 5ª vez");
        System.out.println("contador = " + ClasseStatic.getContador());
    }
}