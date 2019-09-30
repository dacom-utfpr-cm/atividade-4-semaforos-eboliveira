import java.util.concurrent.Semaphore;

public class OtherThread implements Runnable {

    private Semaphore semaphore;
    private Semaphore semaphore2;

    OtherThread(Semaphore semaphore, Semaphore semaphore2){
        this.semaphore = semaphore;
        this.semaphore2 = semaphore2;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Trecho 1.1");
            semaphore2.acquire();
            System.out.println("Trecho 1.2");
            semaphore.release();
            semaphore2.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
