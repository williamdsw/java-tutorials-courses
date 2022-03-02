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
public class LogicalStatements
{
    public static void main4(String[] args)
    {
        int age = 20;
        int money = 1000;
        
        //&& = Operador "E"
        if(age > 18 && money > 500)
        {
            System.out.println("Welcome &&");
        }
        
        //&& = Operador "OU"
        if(age < 30 || money == 1000)
        {
            System.out.println("Welcome ||");
        }
        
        // ! = Operador "NOT"
        if(!(age == 21))
        {
            System.out.println("Welcome !");
        }
    }
}
