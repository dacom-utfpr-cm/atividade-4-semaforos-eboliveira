import java.util.concurrent.Semaphore;

public class WaiterThread implements Runnable {

    private Semaphore semaphore;

    WaiterThread(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println("Thread aguardante iniciada");
        try {
            semaphore.acquire();
            System.out.println("Thread aguardante finalizada");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
