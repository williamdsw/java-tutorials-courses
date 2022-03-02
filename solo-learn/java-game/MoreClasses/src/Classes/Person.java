/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Objects;

/**
 *
 * @author William
 */

/* Para gerar hashCode() e equals(): 
   Basta pressionar "Alt + Insert" > gerar..
*/
public class Person
{
    //variáveis
    private String name;

    //Construtor
    public Person(String pname)
    {
        this.name = pname;
    }  
    
    //Dá para gerar Getter e Setter pelo mesmo atalho
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    //Gera um code em hash
    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.name);
        return hash;
    }

    //Compara objetos dessa classe
    @Override
    public boolean equals(Object obj)
    {
        //verifica se é o objeto
        if (this == obj)
        {
            return true;
        }
        
        if (obj == null)
        {
            return false;
        }
        
        if (getClass() != obj.getClass())
        {
            return false;
        }
        
        //cria nova instância com cast
        final Person other = (Person) obj;
        
        //verifica os parâmetros
        if (!Objects.equals(this.name, other.name))
        {
            return false;
        }
        return true;
    } 
}


