/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

//necessário para trabalhar com inputs do usuário
import java.util.Scanner;

/**
 *
 * @author William
 */
public class GettingUserInput
{
    public static void main5(String[] args)
    {
        //instância de Scanner
        Scanner scan = new Scanner(System.in);
        
        //nextLine() = pega o que o usuário digitou
        System.out.println(scan.nextLine());
    }
}
