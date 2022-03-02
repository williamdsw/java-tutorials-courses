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
public class SwitchStatement
{
    public static void main5(String[] args)
    {
        int day = 3;
        
        //switch clássico...
        switch(day)
        {
            case 6:
                System.out.println("Saturday!");
                break;
                
            case 7:
                System.out.println("Sunday!");
                break;
                
            default:
                System.out.println("Weekday");
        }
    }
}
