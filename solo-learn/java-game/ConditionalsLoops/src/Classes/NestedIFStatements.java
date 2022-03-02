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
public class NestedIFStatements
{
    public static void main2(String[] args)
    {
        int age = 25;
        
        // ifs aninhados
        if(age > 0)
        {
            if(age > 16)
            {
                System.out.println("Welcome!");
            }
            else
            {
                System.out.println("Too young!");
            }
        }
        else
        {
            System.out.println("Error!");
        }
    }
}
