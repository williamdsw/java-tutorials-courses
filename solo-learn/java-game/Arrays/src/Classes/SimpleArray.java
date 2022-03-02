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
public class SimpleArray
{
    public static void main1(String[] args)
    {
        //array de inteiros
        int[] arr = new int[5];
        
        //atribuindo valor pelo index
        arr[2] = 42;
        
        System.out.println(arr[2]);
        
        //array de strings
        String[] letters = {"A", "B", "C", "D", "E"};
        
        System.out.println(letters[3]);
    }
}
