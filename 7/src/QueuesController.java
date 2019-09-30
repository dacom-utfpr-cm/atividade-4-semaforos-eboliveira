import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class QueuesController implements Runnable{
    private ArrayList<Thread> queue1 = new ArrayList<>();
    private ArrayList<Thread> queue2 = new ArrayList<>();
    private Semaphore semaphore1 = new Semaphore(0);
    private Semaphore semaphore2 = new Semaphore(0);

    public void runPair() throws InterruptedException {
        System.out.println("Tentando obter semáforos");
        semaphore1.acquire();
        System.out.println("Semafóro da fila 1 obtido");
        semaphore2.acquire();
        System.out.println("Semafóro da fila 2 obtido");
        this.queue1.remove(0).start();
        this.queue2.remove(0).start();
    }

    public void enterOnQueue(int queueNumber, Thread thread)  {
        if(queueNumber == 1){
            queue1.add(thread);
            semaphore1.release();
        }else{
            queue2.add(thread);
            semaphore2.release();
        }
    }

    @Override
    public void run() {
        while(true){
            try {
                runPair();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
