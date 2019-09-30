import java.util.concurrent.Semaphore;

public class Counter {

    private Semaphore semaphore = new Semaphore(1);
    private Integer counter = 0;

    public void increment() throws InterruptedException {
        semaphore.acquire();
        counter+=1;
        System.out.println("Contador incrementado, valor: " + counter);
        semaphore.release();
    }


}
