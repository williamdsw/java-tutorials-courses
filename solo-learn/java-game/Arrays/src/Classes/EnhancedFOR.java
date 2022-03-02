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
public class EnhancedFOR
{
    public static void main3(String[] args)
    {
        //declaração
        int[] primes = {2, 3, 5, 7};
        
        //for "melhorado" = é equivalente ao "foreach" do C#
        for(int i: primes)
        {
            System.out.println(i);
        }
        
    }
}
