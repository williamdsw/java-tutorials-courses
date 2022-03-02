/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author William
 */

// Excessões: são erros que podem acontecer no sistema
public class MyClass
{
    public static void main1(String[] args)
    {
        try
        {            
            //array
            int[] a = new int[2];
            
            //dará error de exceção "nulo" porque o indice não existe
            System.out.println(a[5]);
        } 
        catch (Exception e)
        {
            //getCause() = pega o motivo do erro
            System.out.println("An error occurred \n" + e.getCause());
        }
    }
    
    public static void main2(String[] args)
    {
        divide(5, 0);
    }
    
    //throws = permite manipular manualmente as excessões
    private static int divide(int a, int b) throws ArithmeticException
    {
        if(b == 0)
        {
            throw new ArithmeticException("Division by Zero");
        }
        else
        {
            return a / b;
        }
    }
}
