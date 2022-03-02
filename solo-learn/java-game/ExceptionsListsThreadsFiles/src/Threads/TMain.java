/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author William
 */
public class TMain
{
    public static void main1(String[] args)
    {
        try
        {
            // <editor-fold desc="Threads">
            
            //instância
            Loader obj = new Loader();

            //iniciando a thread
            obj.start();

            //instância necessária para Runnable
            Thread t = new Thread(new OtherLoader());

            //iniciando a thread
            t.start();
            
            // </editor-fold>
            
            // <editor-fold desc="Runtime vs Checked Exceptions">
            
            /* tipos de excessões:
            checked: a excessão é checada na compilação
            unchecked: a excessão é checada no tempo de execução      
            */
            
            //exemplo de checked:
            Thread.sleep(1000);
            
            //exemplo de unchecked
            int value = 7;
            value /= 0;
            
            // </editor-fold>   
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }       
    }
}
