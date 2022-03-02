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
public class Methods
{
    public static void main1(String[] args)
    {
        //chamada dos métodos
        sayHello();
        sayHello("Willis");
        System.out.println(sum(5, 7));
        System.out.println(max(3.2f, 9.7f));      
    }
    
    //método void = sem retorno
    static void sayHello()
    {
        System.out.println("Hello!");
    }
    
    //método void com parâmetro
    static void sayHello(String name)
    {
        System.out.println("Hello " + name);
    }
    
    //método com retorno int e parâmetros int
    static int sum(int x, int y)
    {
        return x + y;
    }
    
    //método com retorno float, parâmetros float e if-else...
    static float max(float a, float b)
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
