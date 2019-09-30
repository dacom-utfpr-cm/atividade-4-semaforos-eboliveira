// Autor: Eduardo Barbosa de Oliveira       24/09/2019

// Descrição: Enviar sinalização para um ponto de encontro entre threads.
// Faça um código que uma thread t1 e t2 são inicializadas e t1 espera por t2 e vice-versa.

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Semaphore semaphore2 = new Semaphore(0);
        new Thread(new OtherThread(semaphore, semaphore2)).start();
        new Thread(new MyThread(semaphore, semaphore2)).start();
    }
}
