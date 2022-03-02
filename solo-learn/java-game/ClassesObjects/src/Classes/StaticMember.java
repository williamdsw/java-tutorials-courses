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
public class StaticMember
{
    public static void main7(String[] args)
    {
        //Instâncias
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        
        //posso chamar sem objeto
        System.out.println(Counter.COUNT);      
        Counter.showCount();     
    }
}


