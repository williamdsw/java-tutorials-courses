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
public class MultidimensionalArrays
{
    public static void main4(String[] args)
    {
        //declaração... row index - column index
        int[][] sample = {{1,2,3}, {4,5,6}};
        
        int num = sample[1][0];
        
        System.out.println("sample[1][0] = " + num);
    }
}
