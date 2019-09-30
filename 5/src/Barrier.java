import java.util.concurrent.Semaphore;

public class Barrier {
    private final int n;
    private Semaphore semaphore;

    Barrier(int n){
        semaphore = new Semaphore(-n + 1);
        this.n = n;
    }

    public void methodWithBarrier() throws InterruptedException {
        Thread.sleep((long) (Math.random() * 5000));
        System.out.println("Terminei, aguardando outros");
        semaphore.release();
        semaphore.acquire();
        semaphore.release(n);
        System.out.println("Voltei a execução");
    }
}
