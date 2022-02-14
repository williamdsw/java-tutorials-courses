package br.com.oo.CAP_16_2;

/**
 * @author William
 */
public class ExemploThreadSynchronized {
    public static void main(String[] args) {
        testaThreadSynchronized();
    }

    private static void testaThreadSynchronized() {
        try {
            // Dados
            Conta conta = new Conta();
            conta.setSaldo(100.00);

            // Runnables
            Runnable depositar = () -> {
                conta.deposita(1000.00);
            };
            Runnable atualizar = () -> {
                conta.atualiza(1.00);
            };

            // Threads
            Thread depositarThread = new Thread(depositar);
            Thread atualizarThread = new Thread(atualizar);

            // Inicializa
            depositarThread.start();
            atualizarThread.start();

            // Indica que a Thread do main espere que elas terminem
            depositarThread.join();
            atualizarThread.join();

            System.out.printf("Saldo atualizado: %s \n", conta.getSaldo());
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}