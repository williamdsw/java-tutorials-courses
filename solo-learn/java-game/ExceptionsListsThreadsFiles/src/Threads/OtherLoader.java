/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author William
 */

//Outra forma de utilizar Thread, é utilizando a interface "Runnable"
public class OtherLoader implements Runnable
{
    //run() = Descreve a funcionalidade da Thread em questão
    @Override
    public void run()
    {
        System.out.println("Hello using Runnable!");
    }
}
