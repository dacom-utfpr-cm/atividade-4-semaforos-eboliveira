// Autor: Eduardo Barbosa de Oliveira       24/09/2019

// Descrição: Garantir acesso à seção crítica para no máximo N threads.
// Faça um código que possibilite que N threads estejam na seção crítica simultaneamente.


import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        Semaphore semaphore = new Semaphore(n);
        new Thread(new MyThread(semaphore)).start();
        new Thread(new MyThread(semaphore)).start();
        new Thread(new MyThread(semaphore)).start();
        new Thread(new MyThread(semaphore)).start();
        new Thread(new MyThread(semaphore)).start();
        new Thread(new MyThread(semaphore)).start();
        new Thread(new MyThread(semaphore)).start();
        new Thread(new MyThread(semaphore)).start();
        new Thread(new MyThread(semaphore)).start();

    }
}
