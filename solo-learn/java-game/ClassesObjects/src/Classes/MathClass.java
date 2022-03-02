/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author William
 */

/*******************
 * A classe Math gera métodos para operações matemáticas.
 * 
 *******************/
public class MathClass
{
    public static void main6(String[] args)
    {
        //abs() = determina o número absoluto
        int a = Math.abs(10);
        double b = Math.abs(-20.5);
        
        System.out.println("abs() = " + a + '\n' + b);
        
        //ceil() = arredonda o número para cima do inteiro mais próximo
        double c = Math.ceil(7.321);
        
        //floor() = arredonda o número para baixo do inteiro mais próximo
        double d = Math.floor(7.321);
        
        System.out.println("ceil() = " + c + '\n' + "floor() = " + d);
        
        //max() = determina qual maior número entre dois valores
        int max = Math.max(10, 20);
        
        //min() = determina qual menor numero entre dois valores
        int min = Math.min(10, 20);
        
        System.out.println("10 vs 20..." + '\n' + "max() = " + max + 
                           '\n' + "min() = " + min);
        
        //pow() = potencializa o primeiro número ao segundo
        double p = Math.pow(2, 3);
        
        System.out.println("pow(2, 3) = " + p);
        
        //sqrt() = Retorna a raiz quadrada de um número.
        double num = Math.sqrt(81);
        
        System.out.println("sqrt(81) = " + num);
    }
}
