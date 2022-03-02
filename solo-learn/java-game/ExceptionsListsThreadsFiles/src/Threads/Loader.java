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

// É possível executar aplicações simultâneas em várias Threads
public class Loader extends Thread
{
    //run() = Descreve a funcionalidade da Thread em questão
    @Override
    public void run()
    {
        System.out.println("Hello using Thread!");
    }   
}
