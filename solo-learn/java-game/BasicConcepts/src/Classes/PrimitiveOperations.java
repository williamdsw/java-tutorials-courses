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
public class PrimitiveOperations
{
    //operações primitivas
    private static int sum = 50 + 10;
    private static int subs = 50 - 10;
    private static int mult = 50 * 10;
    private static int div = 50 / 10;
    private static int modulus = 50 % 10;
    
    public static void main3(String[] args)
    {
        System.out.println(String.valueOf(sum) + '\n' + String.valueOf(subs) + '\n' + 
                           String.valueOf(mult) + '\n' + String.valueOf(div) + '\n' + 
                           String.valueOf(modulus));
    }
}
