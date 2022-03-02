/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;

/**
 *
 * @author William
 */
public class FMain
{
    public static void main1(String[] args)
    {
        String menu = "Choose one of the options below:\n" +
                      "1 - Create and Write to a File\n" + 
                      "2 - Verify if File exists\n" + 
                      "3 - Read a File\n";
        
        System.out.println(menu);
        
        Scanner sc = new Scanner(System.in);
        
        int option = sc.nextInt();
        
        switch(option)
        {
            case 1:
                createFile();
                break;
                
            case 2:
                verifyFile();
                break;
                
            case 3:
                readFile();
        }
        
        sc.close();
    }
    
    // <editor-fold desc="Working with Files">
    
    public static void verifyFile()
    {
        /* File = classe para trabalhar com arquivos. 
           Necessita da localização do arquivo */
        File myFile = new File("test.txt");
        
        //exists() = verifica se o arquivo existe
        if(myFile.exists())
        {
            //getName() = retorna o nome do arquivo
            System.out.println(myFile.getName() + " exists!");
        }
        else
        {
            System.out.println("This file doesn't exists");
        }
    }
    
    // </editor-fold>
    
    // <editor-fold desc="Reading a File">
    
    public static void readFile()
    {
        try
        {
            //criando instância da classe
            File myFile = new File("test.txt");
        
            //utilizar Scanner para ler conteúdo do arquivo
            Scanner sc = new Scanner(myFile);
            
            //parecido com Iterator..
            while(sc.hasNext())
            {
                System.out.println(sc.nextLine());
            }
            
            //fechando arquivo
            sc.close();
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("Error: " + e.getMessage());
        }      
    }
    
    // </editor-fold>
    
    // <editor-fold desc="Creating and Writing Files">
    
    public static void createFile()
    {
        try
        {
            
            File myFile = new File("test.txt");
            
            if(!myFile.exists())
            {
                System.out.println("File being created...");
                
                //Formatter = classe para criar e inserir conteúdo em arquivos
                Formatter f = new Formatter(myFile);

                //format() = Recebe parâmetros e argumentos. (parecido com C#)
                f.format("%s %s %s", "1", "John", "Smith \r\n");
                f.format("%s %s %s", "2", "Amy", "Brown \r\n");
                f.format("%s %s %s", "3", "Dave", "Mustaine");

                //fechando arquivo
                f.close();
            }
            else
            {
                System.out.println("File being overwrited...");
            }          
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // </editor-fold>
}
