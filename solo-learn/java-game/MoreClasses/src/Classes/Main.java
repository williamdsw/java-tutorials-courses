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

//criando um "enumerador"
enum Rank
{
    CAPTAIN,
    SARGEANT,
    SOLDIER
}

public class Main
{
    public static void main(String[] args)
    {
        // <editor-fold desc="Polymorphism">
        
        //Duas instâncias da classe pai animal, do tipo dos filhos...
        Animal d = new Dog();
        Animal c = new Cat();
        
        d.makeSound();
        c.makeSound();
        
        // </editor-fold>
        
        // <editor-fold desc="Overloading"> 
        
        //instância da classe
        Overloading over = new Overloading();
        
        //utilizando ambos métodos
        int intRes = over.max(5, 11);
        double doubleRes = over.max(5.2, 11.15);
        
        System.out.println("Int max = " + intRes + '\n' + 
                           "Double max = " + doubleRes);
        
        // </editor-fold>
        
        // <editor-fold desc="Interface">
        
        //Instância da classe que herda interface "ISports"
        Soccer match = new Soccer();
        
        //Chamando seus métodos
        match.setHomeTeam("São Paulo FC");
        match.setAwayTeam("SC Corinthians");  
        
        // </editor-fold>
        
        // <editor-fold desc="Casting">
        
        //Instância
        Casting cast = new Casting();
        
        //Mostrando numero "cast"
        cast.showPI();
        
        // </editor-fold>
        
        // <editor-fold desc="Anonymous Class">
        
        //Instância da classe e chamada de método
        Machine m1 = new Machine();
        m1.start();
        
        //Instância da classe, mas sendo "anônima"
        Machine m2 = new Machine()
        {
            @Override
            public void start()
            {
                System.out.println("Wooooooo");
            }  
        };
        
        m2.start();
        
        // </editor-fold>
        
        // <editor-fold desc="Inner Classes">
        
        //Instância...
        Robot rob = new Robot(128671);
        
        // </editor-fold>
        
        // <editor-fold desc="equals()">
        
        //Instâncias 
        Person dave = new Person("Dave");
        Person james = new Person("James");
        
        String names = dave.getName() + " = " + james.getName() + " ? ";
        
        //Comparação
        System.out.println(names + dave.equals(james));
        
        // </editor-fold>
        
        // <editor-fold desc="Using enums">
        
        //Instâncias do enumerador
        Rank sold = Rank.SOLDIER;
        Rank cap = Rank.CAPTAIN;
        
        //verificação no método
        verifyRank(sold);
        verifyRank(cap);
            
        // </editor-fold>
    }
    
    static void verifyRank(Rank obj)
    {
        switch(obj)
        {
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
                
            case SARGEANT:
                System.out.println("Sargeant says Hello!");
                break;
                
            case SOLDIER:
                System.out.println("Soldier says Hi!");
                break;
        }
    }
}
