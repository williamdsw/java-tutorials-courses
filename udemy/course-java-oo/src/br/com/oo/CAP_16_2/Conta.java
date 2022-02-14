package br.com.oo.CAP_16_2;

/**
 * @author William
 */
public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*
     * synchronized = apenas a thread que tem a chave desse metodo
     * podera acessa-lo simultaneamente
     * ou seja, o metodo podera ser acessado por apenas uma Thread
     */
    public synchronized void atualiza(double taxa) {
        double saldoAtualizado = this.saldo * (1 + taxa);
        this.saldo = saldoAtualizado;
    }

    public synchronized void deposita(double valor) {
        double novoSaldo = this.saldo + valor;
        this.saldo = novoSaldo;
    }
}