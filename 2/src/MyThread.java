import java.util.concurrent.Semaphore;

public class MyThread implements Runnable {

    private Semaphore semaphore;
    private Semaphore semaphore2;

    MyThread(Semaphore semaphore, Semaphore semaphore2){
        this.semaphore = semaphore;
        this.semaphore2 = semaphore2;
    }

    @Override
    public void run() {
        try {
            System.out.println("Trecho 2.1");
            semaphore2.release();
            semaphore.acquire();
            System.out.println("Trecho 2.2");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
