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
public class WhileLoop
{
    public static void main6(String[] args)
    {
        int x = 3;
        
        //while com decremento
        while(x > 0)
        {
            System.out.println("x = " + x);
            x--;
        }
        
        int y = 0;
        
        //while com incremento
        while(y < 10)
        {
            System.out.println("y = " + y);
            y++;
        }
        
        y = 0;
        
        //while com break
        while(y < 10)
        {
            System.out.println("y = " + y);
            
            if(y == 7)
                break;
            
            y++;
        }
    }
    
}
