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

// Utilizando classes internas "inner classes"
public class Robot
{
    //variáveis
    private int _id;
    
    //Construtor
    public Robot(int newID)
    {
        _id = newID;
        
        Brain b = new Brain();
        
        b.think();    
    }
    
    //Declaração de classe interna. Só pode ser "private"
    private class Brain
    {
        public void think()
        {
            System.out.println(_id + " is thinking");
        }
    }
}
