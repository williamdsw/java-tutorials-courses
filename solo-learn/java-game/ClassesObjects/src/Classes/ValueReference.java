/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Samples.Person;

/**
 *
 * @author William
 */
public class ValueReference
{
    public static void main5(String[] args)
    {
        //declarando
        int x = 5;
        
        /* passando variável por valor : 
           onde se opera o valor da variável, não ela mesma.    
        */
        addOneTo(x);
        
        //irá printar "5"
        System.out.println(x);
        
        //Instância da classe "Person"
        Person obj = new Person("John");
        
        //definindo a idade
        obj.setAge(20);
        
        /* Passando variável por referência:
           Irá guardar o endereço na memória da variável,
           podendo assim modificar o valor atual da mesma.     
        */
        celebrateBirthday(obj);
        
        //irá printar "21"
        System.out.println(obj.getAge());     
    }
    
    private static void addOneTo(int num)
    {
        num += 1;
    }
    
    private static void celebrateBirthday(Person p)
    {
        p.setAge(p.getAge() + 1);
    }
}
