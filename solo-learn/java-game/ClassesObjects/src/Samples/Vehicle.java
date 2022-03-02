package Samples;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author William
 */
public class Vehicle
{
    //variáveis - atributos
    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;
    
    //Construtor vazio
    public Vehicle()
    {}
    
    //Construtor com parâmetro
    public Vehicle(String c)
    {
        this.color = c;
    }
   
    //Getter = retorna valores
    public String getColor()
    {
        return color;
    }
    
    //Setter = atribui valores
    public void setColor(String newColor)
    {
        color = newColor;
    }
    
     public void horn()
    {
        System.out.println("Beep!");
    }
}
