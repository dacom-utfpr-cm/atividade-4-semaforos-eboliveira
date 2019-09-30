
public class MyThread implements Runnable {

    private Counter counter;

    MyThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            while (true){
                Thread.sleep((long) (Math.random() * 100));
                counter.increment();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
