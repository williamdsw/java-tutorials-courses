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

//extends = indica que a classe é filha
public class Dog extends Animal
{
    public Dog()
    {
        legs = 4;
    }
    
    //Utilizando polimorfismo. @Override = sobreescreve o método original
    @Override
    public void makeSound()
    {
        System.out.println("Dog: Woof");
    }
}
