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
public class SummingElements
{
    public static void main2(String[] args)
    {
        //inicializando array
        int[] myArray = new int[5];
        
        //length = tamanho de itens do array
        System.out.println(myArray.length);
        
        //inicializando
        int[] otherArray = {6, 42, 3, 7};
        int sum = 0;
        
        //iterando e somando os indices
        for(int i = 0; i < otherArray.length; i++)
        {
            sum += otherArray[i];
        }
        
        //exibindo a soma
        System.out.println(sum);
    }
}
