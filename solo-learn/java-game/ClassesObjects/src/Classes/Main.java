/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

//para importar outros pacotes
import Samples.*;

/**
 *
 * @author William
 */
public class Main
{
    public static void main4(String[] args)
    {
        //instância da classe..
        Animal dog = new Animal();
        
        //chamada com objeto criado
        dog.bark();
        
        //instâncias
        Vehicle car = new Vehicle();
        Vehicle bike = new Vehicle("Blue");
        
        //chamadas com objetos criados
        car.setColor("Black");
        
        System.out.println(car.getColor());
        
        bike.horn();      
    }
}
