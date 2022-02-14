package br.com.oo.CAP_10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author William
 */
public class ExemploException {
    public static void main(String[] args) {
        testaException();
    }

    private static void testaException() {

        int valor = 0;

        // Scanner para pegar valor do teclado
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Informe um valor do tipo inteiro : ");
            valor = input.nextInt();
            System.out.printf("Você digitou o valor %d \n", valor);
        } catch (InputMismatchException exception) {
            System.out.println(exception.getMessage());
            System.out.println("O valor que você digitou não é um inteiro");
        } finally {
            System.out.println("Zerando a variável ");
            valor = 0;
        }

        System.out.printf("Você digitou o valor %d", valor);
    }
}