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
public class DoWhileLoop
{
    public static void main8(String[] args)
    {
        int x = 1;
        
        //do while clássico...
        do
        {
            System.out.println(x);
            x++;
        }
        while(x < 5);
        
        System.out.println("End of iteration");
    }
}
