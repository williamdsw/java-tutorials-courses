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
public class IncrementDecrement
{
    public static void main4(String[] args)
    {
        int num = 5;
        
        System.out.println("Number: " + num);
        
        //pré incremento
        ++num;
        
        System.out.println("Prefix Increment: " + num);
        
        //pós incremento
        num++;
        
        System.out.println("Posfix Increment: " + num);
        
        //pré decremento
        --num;
        
        System.out.println("Prefix Increment: " + num);
        
        //pós decremento
        num--;
        
        System.out.println("Posfix Increment: " + num);
    }
}
