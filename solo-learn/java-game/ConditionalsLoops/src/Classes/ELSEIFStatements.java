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
public class ELSEIFStatements
{
    public static void main3(String[] args)
    {
        int age = 25;
        
        //palavra chave "else if"
        if(age <= 0)
        {
            System.out.println("Error!");
        }
        else if(age <= 16)
        {
            System.out.println("Too young!");
        }
        else if(age < 100)
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("Really!?");
        }
    }
}
