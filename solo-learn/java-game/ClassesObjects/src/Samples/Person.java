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
public class Person
{
    //variáveis
    private String name;
    private int age;
    
    //Construtor
    public Person(String pname)
    {
        this.name = pname;
    }
    
    //Getter
    public int getAge()
    {
        return age;
    }
    
    //Setter
    public void setAge(int newAge)
    {
        age = newAge;
    }
}
