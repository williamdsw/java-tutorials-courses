package br.com.oo.CAP_14_2;

import java.awt.HeadlessException;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 * @author William
 */
public class ExemploGUI {
    public static void main(String[] args) {
        testaGUI();
    }

    private static void testaGUI() {
        try {
            Cliente cliente = new Cliente();

            // Nome
            String nome = JOptionPane.showInputDialog("Informe o nome do cliente:");
            cliente.setNome(nome);

            // CPF
            long cpf = Long.parseLong(JOptionPane.showInputDialog("Informe o cpf do cliente:"));
            cliente.setCpf(cpf);

            // Exibe
            String informacoes = "Nome: %s \n CPF: %s";
            informacoes = String.format(informacoes, nome, cpf);
            JOptionPane.showMessageDialog(null, informacoes);

            // Exibe valores de Wrappers
            String str = "100";
            String messagem = "STRING: %s, \nINT: %d, \nDOUBLE: %f, \nDECIMAL: %f \n";
            messagem = String.format(messagem, str, Integer.parseInt(str), Double.parseDouble(str),
                    new BigDecimal(str));
            JOptionPane.showMessageDialog(null, messagem);
        } catch (HeadlessException | NumberFormatException exception) {
            System.out.println(exception.getMessage());
        }
    }
}