package br.com.oo.CAP_16;

/**
 * @author William
 */
public class ExemploThreads {
    private final static int NUMERO_MAXIMO_OCORRENCIAS = 20;

    public static void main(String[] args) {
        testaThread();
    }

    // AS THREADS VAO EXECUTAR UM POUCO DE CADA TAREFA
    /*
     * Para uma Thread executar uma tarefa, e necessario a classe implementar de
     * "Runnable"
     * E sobreescrever o metodo "run()"
     */
    private static void testaThread() {
        try {
            Runnable buscando = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < NUMERO_MAXIMO_OCORRENCIAS; i++) {
                        System.out.println("Executando a primeira Thread");
                    }
                }
            };

            // Thread com Runnable
            Thread primeiraThread = new Thread(buscando);
            primeiraThread.start();

            Runnable lendo = () -> {
                for (int i = 0; i < NUMERO_MAXIMO_OCORRENCIAS; i++) {
                    System.out.println("Executando a segunda Thread");
                }
            };

            // Thread com Runnable
            Thread segundaThread = new Thread(lendo);
            segundaThread.start();

            primeiraThread.join();
            segundaThread.join();
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
    }
}