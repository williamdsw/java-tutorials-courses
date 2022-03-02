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
public class Cat extends Animal
{
    public Cat()
    {
        legs = 4;
    }

    //Sobreescrevendo método da classe pai
    @Override
    public void makeSound()
    {
        System.out.println("Cat: Meow");
    }   
}
