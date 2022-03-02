/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author William
 */
public class LMain
{
    public static void main1(String[] args)
    {
        // <editor-fold desc="ArrayList">
        
        //ArrayList = recomendado para acesso rápido à dados
        //Inicialização...
        ArrayList<String> colors = new ArrayList<>();
        
        //add() = adiciona um item a lista
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        
        //remove() = remove um item da lista
        colors.remove("Orange");
        
        //printando itens
        System.out.println(colors);
        
        // </editor-fold>
        
        // <editor-fold desc="LinkedList">
        
        //LinkedList = recomendado para diversos "inserts" e "deletes"
        //inicializando.. não pode definir um tamanho
        LinkedList<String> soccerTeams = new LinkedList<>();
        
        //adicionando itens...
        soccerTeams.add("São Paulo");
        soccerTeams.add("Santos");
        soccerTeams.add("Corinthians");
        soccerTeams.add("Palmeiras");
        soccerTeams.add("Portuguesa");
        
        //removendo item pelo indice
        soccerTeams.remove(4);
        
        //iterando e printando itens
        for(String item : soccerTeams)
        {
            System.out.println(item);
        }
        
        // </editor-fold>
        
        // <editor-fold desc="HashMap">
        
        //HashMap = é uma coleção baseada em pares de chave (key) e valor (value)
        //Inicialização...
        HashMap<String, Integer> points = new HashMap<>();
        
        //put() = Insere um valor com uma determinada chave
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 133);
        points.put("Sting", 999);
        
        //remove() = Remove um item pela chave
        points.remove("Sting");
        
        //get() = Pega um valor pela chave determinada
        System.out.println("Dave points: " + points.get("Dave"));
        
        //instância de Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insert the name of any key : ");
        
        //pegando próxima linha do usuário
        String key = sc.nextLine();
        
        //constainsKey() = verifica se existe tal chave
        if(points.containsKey(key))
        {
            System.out.println("Value of " + key + " : " + points.get(key));
        }
        else
        {
            System.out.println("The key doesn't exist");
        }
        
        System.out.println("Insert any value (integer) : ");
        
        //pegando próximo inteiro do usuário
        int value = sc.nextInt();
        
        //constainsValue() = Verifica se existe um valor
        if(points.containsValue(value))
        {
            System.out.println("This value exists!");
        }
        else
        {
            System.out.println("This value doesn't exist!");
        }
        
        // </editor-fold>
        
        // <editor-fold desc="HashSet">
        
        //Set = é uma coleção que não pode conter valores duplicados
        HashSet<String> myHashSet = new HashSet<>();
        
        //adicionando itens
        myHashSet.add("B");
        myHashSet.add("D");
        myHashSet.add("C");
        
        //printando itens e tamanho (size) do set
        System.out.println("myHashSet values = " + myHashSet);
        System.out.println("myHashSet size = " + myHashSet.size());
           
        // </editor-fold>
        
        // <editor-fold desc="LinkedHashSet">
        
        //LinkedHashSet = mantém a ordem dos elementos que foram inseridos
        HashSet<String> myLinkedSet = new HashSet<>();
        
        //adicionando itens
        myLinkedSet.add("A");
        myLinkedSet.add("B");
        myLinkedSet.add("C");
        
        //printando itens e tamanho (size) do set
        System.out.println("myLinkedSet values = " + myLinkedSet);
        System.out.println("myLinkedSet size = " + myLinkedSet.size());
           
        // </editor-fold>
            
        // <editor-fold desc="Sorting Lists">
        
        manipulateList();
        
        // </editor-fold>
        
        // <editor-fold desc="Iterator">
         
        iteratingList();
        
        // </editor-fold>
    } 
    
    private static void manipulateList()
    {
        //criação
        ArrayList<String> animals = new ArrayList<>();
        
        //adicionando itens
        animals.add("Dog");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Snake");
        animals.add("Bat");
        
        //printando itens
        System.out.println("Animals list = " + animals);
        
        //sort() = organiza a lista de forma alfabética
        Collections.sort(animals);
        
        System.out.println("Animals list after sort = " + animals);
        
        //reserve() = reverte a lista de forma alfabética
        Collections.reverse(animals);
        
        System.out.println("Animals list after reverse = " + animals);
        
        //shuffle() = embaralha os itens de forma aleatória
        Collections.shuffle(animals);
        
        System.out.println("Animals list after shuffle = " + animals);
    }
    
    private static void iteratingList()
    {
        //criando lista...
        LinkedList<String> animals = new LinkedList<>();
        
        //adicionando itens
        animals.add("Fox");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rabbit");
        
        //criando iterator da lista
        Iterator<String> it = animals.iterator();
        
        //iterando por cada item
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
