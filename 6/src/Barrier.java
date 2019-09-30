import java.util.concurrent.Semaphore;

public class Barrier {
    private final int n;
    private Semaphore semaphore;

    Barrier(int n){
        semaphore = new Semaphore(0);
        this.n = n;
    }

    public void methodWithBarrier() throws InterruptedException {
        while(true){
            Thread.sleep((long) (Math.random() * 5000));
            System.out.println("Terminei, aguardando outros");
            if(semaphore.getQueueLength() == n-1){
                semaphore.release(n);
            }
            semaphore.acquire();
            System.out.println("Voltei a execução");
        }
    }
}
