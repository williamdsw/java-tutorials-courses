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

/* ENCAPSULAMENTO : Consiste em "esconder" os dados de uma classe 
                    utilizando Getters e Setters
*/
public class BankAccount
{
    //variável privada
    private double _balance = 0;
   
    //encapsulador "Setter"
    public void deposit(double value)
    {
        if(value > 0)
        {
            _balance += value;
        }
    }   
}
