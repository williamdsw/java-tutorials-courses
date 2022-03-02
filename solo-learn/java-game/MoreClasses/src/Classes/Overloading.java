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

// Utilizando sobrecarga (overloading) de método
public class Overloading
{
    //método com retorno e parâmetros "int"
    public int max(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    //método com retorno e parâmetros double
    public double max(double a, double b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
