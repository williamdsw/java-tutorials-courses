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
// implements = palavra chave para implementar "interface"
public class Soccer implements ISports
{
    public Soccer()
    {
        System.out.println("Soccer match today!");
    }
    
    //Obrigatório sobreescrever métodos da interface
    @Override
    public void setHomeTeam(String name)
    {
        System.out.println("Home team: " + name);
    }

    @Override
    public void setAwayTeam(String name)
    {
        System.out.println("Away team: " + name);
    }   
}
