import java.util.concurrent.Semaphore;

public class MyThread implements Runnable {


    private Semaphore semaphore;

    @Override
    public void run() {
        try {
            semaphore.acquire();
            Thread.sleep((long) (Math.random() * 1000));
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    MyThread(Semaphore semaphore){
        this.semaphore = semaphore;
    }

}
