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
public class IFStatement
{
    public static void main1(String[] args)
    {
        int x = 7;
        
        //if comum
        if(x < 42)
        {
            System.out.println("Hi");
        }
        
        int age = 30;
        
        //if com else
        if(age < 16)
        {
            System.out.println("Too young!");
        }
        else
        {
            System.out.println("Welcome!");
        }
    }
}
