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
public class Counter
{
    /* definindo um membro estático. 
    pode ser chamado sem instância de objeto */
    public static int COUNT = 0;

    public Counter()
    {
        COUNT++;
    }  
    
    public static void showCount()
    {
        System.out.println(COUNT);
    }
}