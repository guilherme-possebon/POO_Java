
import java.util.concurrent.Semaphore;

// Classe que representa um Processo (Thread)
class Processo extends Thread {

    private Semaphore semaforo;
    private int id;

    // Construtor que recebe o semáforo e o ID do processo
    public Processo(Semaphore semaforo, int id) {
        this.semaforo = semaforo;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            // Tenta adquirir o semáforo antes de entrar na seção crítica
            System.out.println("Processo " + id + " está tentando entrar.");
            semaforo.acquire();
            System.out.println("Processo " + id + " entrou na seção crítica.");

            // Simula a execução do processo na seção crítica
            Thread.sleep(2000); // Dorme por 2 segundos

            // Sai da seção crítica
            System.out.println("Processo " + id + " está saindo da seção crítica.");
            semaforo.release();
        } catch (InterruptedException e) {
            System.out.println("Processo " + id + " foi interrompido.");
        }
    }
}

// Classe principal que controla os processos
class ControleProcessos {

    public static void main(String[] args) {
        // Define o número de permissões do semáforo (por exemplo, 2 processos podem acessar simultaneamente)
        int permissoes = 2;
        Semaphore semaforo = new Semaphore(permissoes);

        // Define o número de processos
        int numeroProcessos = 5;
        Processo[] processos = new Processo[numeroProcessos];

        // Cria e inicia os processos
        for (int i = 0; i < numeroProcessos; i++) {
            processos[i] = new Processo(semaforo, i + 1);
            processos[i].start();
        }

        // Aguarda todos os processos terminarem
        for (int i = 0; i < numeroProcessos; i++) {
            try {
                processos[i].join();
            } catch (InterruptedException e) {
                System.out.println("Processo principal foi interrompido.");
            }
        }

        // Dados de saída final
        System.out.println("Todos os processos concluíram.");
    }
}
