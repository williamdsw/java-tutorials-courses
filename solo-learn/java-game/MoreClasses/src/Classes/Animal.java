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

//classe pai abstrata
public abstract class Animal
{
    //variáveis
    protected int legs = 0;
    
    public void eat()
    {
        System.out.println("Animal eats");
    }
    
    //métodos abstract não pode ter corpo
    public abstract void makeSound();
}
