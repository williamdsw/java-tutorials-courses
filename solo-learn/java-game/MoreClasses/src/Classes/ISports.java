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

/* Interface = é uma classe abstrata com todos os membros abstratos
   - Definir usando a palavra "interface"
   - Pode conter apenas variáveis "static final"
   - Não pode conter construtor, e não pode ser instancializado
   - Pode herdar de outras interfaces
   - Uma classe pode implementar várias interfaces
*/
public interface ISports
{
    public void setHomeTeam(String name);
    public void setAwayTeam(String name);
}
