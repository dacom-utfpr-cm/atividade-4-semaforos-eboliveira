import java.util.concurrent.Semaphore;

public class MyThread implements Runnable {

    private Semaphore semaphore;

    MyThread(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread iniciada");
            semaphore.acquire();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        System.out.println("Thread finalizada");
    }
}
